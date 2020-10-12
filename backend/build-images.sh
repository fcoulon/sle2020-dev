#!/bin/bash

cd lsp/lsp-router
docker build -f src/main/docker/Dockerfile.jvm -t kaulua/lsp-router .
cd ../..

cd document-storage
docker build -f src/main/docker/Dockerfile.jvm -t kaulua/document-storage .
cd ..

cd feature-model
docker build -f src/main/docker/Dockerfile.jvm -t kaulua/feature-model .
cd ..


