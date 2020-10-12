#!/bin/bash

cd completion
docker build -f src/main/docker/Dockerfile.jvm -t fcoulon/nablab-completion .
cd ..

cd definition
docker build -f src/main/docker/Dockerfile.jvm -t fcoulon/nablab-definition .
cd ..

cd highlight
docker build -f src/main/docker/Dockerfile.jvm -t fcoulon/nablab-highlight .
cd ..

cd hover
docker build -f src/main/docker/Dockerfile.jvm -t fcoulon/nablab-hover .
cd ..

cd documentSymbol
docker build -f src/main/docker/Dockerfile.jvm -t fcoulon/nablab-documentsymbol .
cd ..

cd formatting
docker build -f src/main/docker/Dockerfile.jvm -t fcoulon/nablab-formatting .
cd ..

cd references
docker build -f src/main/docker/Dockerfile.jvm -t fcoulon/nablab-references .
cd ..

cd rename
docker build -f src/main/docker/Dockerfile.jvm -t fcoulon/nablab-rename .
cd ..

cd symbol
docker build -f src/main/docker/Dockerfile.jvm -t fcoulon/nablab-symbol .
cd ..

cd workspace
docker build -f src/main/docker/Dockerfile.jvm -t fcoulon/nablab-workspace .
cd ..

