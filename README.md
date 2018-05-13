# Demo Rest API
This is a Demo rest API using Spring Boot, MongoDB running in docker containers defined by docker-compose yml file.

![](https://cdn-images-1.medium.com/max/1200/1*02NqqST-JKZCDAPg9mOBiQ.png)

A full article is available on this [medium post.](https://medium.com/@volmar.oliveira.jr/a-restapi-using-spring-boot-mongodb-running-on-docker-containers-5e530b48f45e)

## Requirements
- Java 8
- Maven 3.3.9
- Docker 1.13.1
- Docker-compose 1.21.0

## TL;DR - Build and Run
Will build, package and create a new Docker image with the application
 
```mvn clean package```
 
Launch an Application and a Mongo container

```docker-compose up```

## Docker
The docker file defines a container based on Java with the jar created by maven package, the `dockerfile-maven-plugin` is responsible to build a new image, a push could be configured in the pom file also.

## Docker-compose
The Docker-compose file describes our multi-container application, the application consists in 2 containers, one running the DemoRestApi and a linked container with MongoDB. These containers have the 8080 port exposed for the RestAPI and 27017 for mongo (Just for testing purposes, should preferably removed)

# Next Steps
- Tests improvements
- Authentication

This is just a initial implementation to be used as example exercising Spring boot, Docker, MongoDB. Another features and technologies will be added to this project.

## Author
Volmar Oliveira Junior

volmar.oliveira.jr@gmail.com
