#!/bin/bash


cd completion
docker build -f src/main/docker/Dockerfile.jvm -t minijava/completion .
cd ..

cd definition
docker build -f src/main/docker/Dockerfile.jvm -t minijava/definition .
cd ..

cd highlight
docker build -f src/main/docker/Dockerfile.jvm -t minijava/highlight .
cd ..

cd hover
docker build -f src/main/docker/Dockerfile.jvm -t minijava/hover .
cd ..

cd documentSymbol
docker build -f src/main/docker/Dockerfile.jvm -t minijava/documentsymbol .
cd ..

cd formatting
docker build -f src/main/docker/Dockerfile.jvm -t minijava/formatting .
cd ..

cd references
docker build -f src/main/docker/Dockerfile.jvm -t minijava/references .
cd ..

cd rename
docker build -f src/main/docker/Dockerfile.jvm -t minijava/rename .
cd ..

cd symbol
docker build -f src/main/docker/Dockerfile.jvm -t minijava/symbol .
cd ..

cd workspace
docker build -f src/main/docker/Dockerfile.jvm -t minijava/workspace .
cd ..

