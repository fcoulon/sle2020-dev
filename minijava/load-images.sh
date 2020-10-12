#!/bin/bash

cd /home/fcoulon/eclipse-workspace/runtime-generation-minijava-runtime/minijava

echo "minijava/completion"
kind load docker-image minijava/completion --name clusterOne

echo "minijava/definition"
kind load docker-image minijava/definition --name clusterOne

echo "minijava/highlight"
kind load docker-image minijava/highlight --name clusterOne

echo "minijava/hover"
kind load docker-image minijava/hover --name clusterOne

echo "minijava/documentsymbol"
kind load docker-image minijava/documentsymbol --name clusterOne

echo "minijava/formatting"
kind load docker-image minijava/formatting --name clusterOne

echo "minijava/references"
kind load docker-image minijava/references --name clusterOne

echo "minijava/rename"
kind load docker-image minijava/rename --name clusterOne

echo "minijava/symbol"
kind load docker-image minijava/symbol --name clusterOne

echo "minijava/workspace"
kind load docker-image minijava/workspace --name clusterOne

