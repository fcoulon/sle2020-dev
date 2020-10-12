#!/bin/bash


echo "thingml/completion"
kind load docker-image thingml/completion --name clusterOne

echo "thingml/definition"
kind load docker-image thingml/definition --name clusterOne

echo "thingml/highlight"
kind load docker-image thingml/highlight --name clusterOne

echo "thingml/hover"
kind load docker-image thingml/hover --name clusterOne

echo "thingml/documentsymbol"
kind load docker-image thingml/documentsymbol --name clusterOne

echo "thingml/formatting"
kind load docker-image thingml/formatting --name clusterOne

echo "thingml/references"
kind load docker-image thingml/references --name clusterOne

echo "thingml/rename"
kind load docker-image thingml/rename --name clusterOne

echo "thingml/symbol"
kind load docker-image thingml/symbol --name clusterOne

echo "thingml/workspace"
kind load docker-image thingml/workspace --name clusterOne

