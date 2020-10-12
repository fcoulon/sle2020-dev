# Distributed Xtext Server for LSP

## Build

### Jar
In backend/
mvn install

In nablab/
mvn install

### Docker images
In backend/
./build-images.sh

In nablab/
./build-images.sh

### The web app
In frontend/
npm install
npx webpack

## Setup the cluster

./launchInspector.sh
./initCluster.sh

## Run the web app
In frontend/
npm run start:dev
