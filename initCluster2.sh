#!/bin/bash

LANG=$1
LANG_FOLDER=$2

# Create the cluster 
kind delete cluster --name clusterone
kind create cluster --config config_cluster.yaml --name clusterone
export KUBECONFIG="$(kind get kubeconfig-path --name="clusterone")"

# Label nodes
kubectl label nodes clusterone-worker kaulua-selector=node1
kubectl label nodes clusterone-worker2 kaulua-selector=node2

# Load docker images into the cluster
echo "Load kaulua/storage"
kind load docker-image kaulua/document-storage --name clusterone
echo "Load kaulua/router"
kind load docker-image kaulua/lsp-router --name clusterone

$LANG_FOLDER/load-images.sh

# Full deployment
kubectl apply -f base-deployment.yaml
kubectl apply -f $LANG_FOLDER/deployment.yaml

# Launch external services
docker run -d --rm -p 7070:8080 $LANG/feature-model

# Install Jaeger
#kubectl create -f https://raw.githubusercontent.com/jaegertracing/jaeger-kubernetes/master/all-in-one/jaeger-all-in-one-template.yml
kubectl create -f jaeger-deployment.yaml

# Install K8 Dashboard
kubectl apply -f https://raw.githubusercontent.com/kubernetes/dashboard/v2.0.0-rc5/aio/deploy/recommended.yaml
kubectl apply -f admin-user.yaml
kubectl apply -f role-binding.yaml
kubectl -n kubernetes-dashboard describe secret $(kubectl -n kubernetes-dashboard get secret | grep admin-user | awk '{print $1}')
#kubectl -n kube-system describe secret $(kubectl -n kube-system get secret | grep admin-user | awk '{print $1}')

# Print useful informations

ROUTER_URL=$(kubectl get pod router --template={{.status.hostIP}})
ROUTER_PORT=$(kubectl get svc router -o=jsonpath='{.spec.ports[?(@.port==8080)].nodePort}')
echo "Websocket endpoint " $ROUTER_URL:$ROUTER_PORT

STORAGE_URL=$(kubectl get pod storage --template={{.status.hostIP}})
STORAGE_PORT=$(kubectl get svc storage -o=jsonpath='{.spec.ports[?(@.port==8086)].nodePort}')
echo "Storage endpoint " $STORAGE_URL:$STORAGE_PORT

echo "Dashboard available at: http://localhost:8001/api/v1/namespaces/kubernetes-dashboard/services/https:kubernetes-dashboard:/proxy/#/cluster?namespace=default"

echo "Tracing available at: http://localhost:8001/api/v1/namespaces/default/services/http:jaeger-query:80/proxy/"


kubectl proxy

