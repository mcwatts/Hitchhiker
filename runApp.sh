#!/bin/bash
docker build -t dockerfile .
docker run dockerfile
java -cp RestfulAPI/target/RestfulAPI-1.0-SNAPSHOT-jar-with-dependencies.jar RestfulServer
