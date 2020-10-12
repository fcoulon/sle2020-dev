#!/bin/bash


cd completion
docker build -f src/main/docker/Dockerfile.jvm -t logo/completion .
cd ..

cd definition
docker build -f src/main/docker/Dockerfile.jvm -t logo/definition .
cd ..

cd highlight
docker build -f src/main/docker/Dockerfile.jvm -t logo/highlight .
cd ..

cd hover
docker build -f src/main/docker/Dockerfile.jvm -t logo/hover .
cd ..

cd documentSymbol
docker build -f src/main/docker/Dockerfile.jvm -t logo/documentsymbol .
cd ..

cd formatting
docker build -f src/main/docker/Dockerfile.jvm -t logo/formatting .
cd ..

cd references
docker build -f src/main/docker/Dockerfile.jvm -t logo/references .
cd ..

cd rename
docker build -f src/main/docker/Dockerfile.jvm -t logo/rename .
cd ..

cd symbol
docker build -f src/main/docker/Dockerfile.jvm -t logo/symbol .
cd ..

cd workspace
docker build -f src/main/docker/Dockerfile.jvm -t logo/workspace .
cd ..

