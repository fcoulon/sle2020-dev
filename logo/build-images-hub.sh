#!/bin/bash

cd completion
docker build -f src/main/docker/Dockerfile.jvm -t fcoulon/logo-completion .
cd ..

cd definition
docker build -f src/main/docker/Dockerfile.jvm -t fcoulon/logo-definition .
cd ..

cd highlight
docker build -f src/main/docker/Dockerfile.jvm -t fcoulon/logo-highlight .
cd ..

cd hover
docker build -f src/main/docker/Dockerfile.jvm -t fcoulon/logo-hover .
cd ..

cd documentSymbol
docker build -f src/main/docker/Dockerfile.jvm -t fcoulon/logo-documentsymbol .
cd ..

cd formatting
docker build -f src/main/docker/Dockerfile.jvm -t fcoulon/logo-formatting .
cd ..

cd references
docker build -f src/main/docker/Dockerfile.jvm -t fcoulon/logo-references .
cd ..

cd rename
docker build -f src/main/docker/Dockerfile.jvm -t fcoulon/logo-rename .
cd ..

cd symbol
docker build -f src/main/docker/Dockerfile.jvm -t fcoulon/logo-symbol .
cd ..

cd workspace
docker build -f src/main/docker/Dockerfile.jvm -t fcoulon/logo-workspace .
cd ..

