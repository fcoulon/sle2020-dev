#!/bin/bash

cd completion
docker build -f src/main/docker/Dockerfile.jvm -t fcoulon/minijava-completion .
cd ..

cd definition
docker build -f src/main/docker/Dockerfile.jvm -t fcoulon/minijava-definition .
cd ..

cd highlight
docker build -f src/main/docker/Dockerfile.jvm -t fcoulon/minijava-highlight .
cd ..

cd hover
docker build -f src/main/docker/Dockerfile.jvm -t fcoulon/minijava-hover .
cd ..

cd documentSymbol
docker build -f src/main/docker/Dockerfile.jvm -t fcoulon/minijava-documentsymbol .
cd ..

cd formatting
docker build -f src/main/docker/Dockerfile.jvm -t fcoulon/minijava-formatting .
cd ..

cd references
docker build -f src/main/docker/Dockerfile.jvm -t fcoulon/minijava-references .
cd ..

cd rename
docker build -f src/main/docker/Dockerfile.jvm -t fcoulon/minijava-rename .
cd ..

cd symbol
docker build -f src/main/docker/Dockerfile.jvm -t fcoulon/minijava-symbol .
cd ..

cd workspace
docker build -f src/main/docker/Dockerfile.jvm -t fcoulon/minijava-workspace .
cd ..

