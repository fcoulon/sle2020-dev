#!/bin/bash

echo "logo/completion"
kind load docker-image logo/completion --name clusterOne

echo "logo/definition"
kind load docker-image logo/definition --name clusterOne

echo "logo/highlight"
kind load docker-image logo/highlight --name clusterOne

echo "logo/hover"
kind load docker-image logo/hover --name clusterOne

echo "logo/documentsymbol"
kind load docker-image logo/documentsymbol --name clusterOne

echo "logo/formatting"
kind load docker-image logo/formatting --name clusterOne

echo "logo/references"
kind load docker-image logo/references --name clusterOne

echo "logo/rename"
kind load docker-image logo/rename --name clusterOne

echo "logo/symbol"
kind load docker-image logo/symbol --name clusterOne

echo "logo/workspace"
kind load docker-image logo/workspace --name clusterOne

