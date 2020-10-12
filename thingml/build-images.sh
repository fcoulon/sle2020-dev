#!/bin/bash


cd completion
docker build -f src/main/docker/Dockerfile.jvm -t thingml/completion .
cd ..

cd definition
docker build -f src/main/docker/Dockerfile.jvm -t thingml/definition .
cd ..

cd highlight
docker build -f src/main/docker/Dockerfile.jvm -t thingml/highlight .
cd ..

cd hover
docker build -f src/main/docker/Dockerfile.jvm -t thingml/hover .
cd ..

cd documentSymbol
docker build -f src/main/docker/Dockerfile.jvm -t thingml/documentsymbol .
cd ..

cd formatting
docker build -f src/main/docker/Dockerfile.jvm -t thingml/formatting .
cd ..

cd references
docker build -f src/main/docker/Dockerfile.jvm -t thingml/references .
cd ..

cd rename
docker build -f src/main/docker/Dockerfile.jvm -t thingml/rename .
cd ..

cd symbol
docker build -f src/main/docker/Dockerfile.jvm -t thingml/symbol .
cd ..

cd workspace
docker build -f src/main/docker/Dockerfile.jvm -t thingml/workspace .
cd ..

