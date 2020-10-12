#!/bin/bash

cd completion
docker build -f src/main/docker/Dockerfile.jvm -t nablab/completion .
cd ..

cd definition
docker build -f src/main/docker/Dockerfile.jvm -t nablab/definition .
cd ..

cd highlight
docker build -f src/main/docker/Dockerfile.jvm -t nablab/highlight .
cd ..

cd hover
docker build -f src/main/docker/Dockerfile.jvm -t nablab/hover .
cd ..

cd documentSymbol
docker build -f src/main/docker/Dockerfile.jvm -t nablab/documentsymbol .
cd ..

cd formatting
docker build -f src/main/docker/Dockerfile.jvm -t nablab/formatting .
cd ..

cd references
docker build -f src/main/docker/Dockerfile.jvm -t nablab/references .
cd ..

cd rename
docker build -f src/main/docker/Dockerfile.jvm -t nablab/rename .
cd ..

cd symbol
docker build -f src/main/docker/Dockerfile.jvm -t nablab/symbol .
cd ..

cd workspace
docker build -f src/main/docker/Dockerfile.jvm -t nablab/workspace .
cd ..

