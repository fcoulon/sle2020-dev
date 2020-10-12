#!/bin/bash

cd completion
docker build -f src/main/docker/Dockerfile.jvm -t fcoulon/thingml-completion .
cd ..

cd definition
docker build -f src/main/docker/Dockerfile.jvm -t fcoulon/thingml-definition .
cd ..

cd highlight
docker build -f src/main/docker/Dockerfile.jvm -t fcoulon/thingml-highlight .
cd ..

cd hover
docker build -f src/main/docker/Dockerfile.jvm -t fcoulon/thingml-hover .
cd ..

cd documentSymbol
docker build -f src/main/docker/Dockerfile.jvm -t fcoulon/thingml-documentsymbol .
cd ..

cd formatting
docker build -f src/main/docker/Dockerfile.jvm -t fcoulon/thingml-formatting .
cd ..

cd references
docker build -f src/main/docker/Dockerfile.jvm -t fcoulon/thingml-references .
cd ..

cd rename
docker build -f src/main/docker/Dockerfile.jvm -t fcoulon/thingml-rename .
cd ..

cd symbol
docker build -f src/main/docker/Dockerfile.jvm -t fcoulon/thingml-symbol .
cd ..

cd workspace
docker build -f src/main/docker/Dockerfile.jvm -t fcoulon/thingml-workspace .
cd ..

