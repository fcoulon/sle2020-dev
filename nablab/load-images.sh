#!/bin/bash

echo "nablab/completion"
kind load docker-image nablab/completion --name clusterone

echo "nablab/definition"
kind load docker-image nablab/definition --name clusterone

echo "nablab/highlight"
kind load docker-image nablab/highlight --name clusterone

echo "nablab/hover"
kind load docker-image nablab/hover --name clusterone

echo "nablab/documentsymbol"
kind load docker-image nablab/documentsymbol --name clusterone

echo "nablab/formatting"
kind load docker-image nablab/formatting --name clusterone

echo "nablab/references"
kind load docker-image nablab/references --name clusterone

echo "nablab/rename"
kind load docker-image nablab/rename --name clusterone

echo "nablab/symbol"
kind load docker-image nablab/symbol --name clusterone

echo "nablab/workspace"
kind load docker-image nablab/workspace --name clusterone

