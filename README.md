This project is the full pipeline of a kafka setup.

## Getting started

In order to start up kafka-ml, you'll need
* a running Docker daemon (at least version 18.06 CE)
* Docker Compose installed (at least version 1.22)

### Start

In order to start the latest built Docker images from Docker Hub, simply execute:

```bash
confluent start
kafka-topics --create --topic udemy-reviews --partitions 3 --replication-factor 1 --zookeeper localhost:2181
kafka-topics --list --zookeeper localhost:2181
kafka-console-consumer --topic udemy-reviews --bootstrap-server localhost:9092
```
run mlproducer service

## Clean up
```bash
confluent destroy
```

## Development Steps
* Create Spring Boot project(https://start.spring.io/)
* Install docker compose
* Start confluent.io docker images with KAFKA_LISTENERS updated or kafka-single-node example
* Create docker image, push to docker hub
* Install minikube
* Create deployment using docker hub image.
