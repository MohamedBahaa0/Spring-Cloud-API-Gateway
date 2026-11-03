# Spring Cloud API Gateway

A microservices demo where **Spring Cloud Gateway** is the single entry point in front of services registered with **Eureka**, and services call each other through **OpenFeign**.

![Java](https://img.shields.io/badge/Java-17-orange) ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.1.2-brightgreen) ![Spring Cloud](https://img.shields.io/badge/Spring%20Cloud-2022.0.3-blue)

## Architecture

```
client ──► API Gateway :8080 ──┬──► first-microservice  :8081   (/first/**)
                               └──► second-microservice :8082   (/second/**) ──Feign──► first-microservice
                 ▲
          Eureka Server :8761 (service registry)
```

| Module | Role |
|---|---|
| `Eurekaserver` | Service registry where the microservices register |
| `springcloud-gateway` | Routes requests by path predicate to the right service |
| `first-microservice` | Sample service exposing REST endpoints |
| `second-microservice` | Sample service that calls `first-microservice` through a Feign client |

## Routing

```yaml
spring:
  cloud:
    gateway:
      routes:
        - id: first-microservice
          uri: http://localhost:8081/
          predicates:
            - Path=/first/**
        - id: second-microservice
          uri: http://localhost:8082/
          predicates:
            - Path=/second/**
```

## Run locally

Start the modules in this order (each is a Spring Boot app):

1. `Eurekaserver`, dashboard at http://localhost:8761
2. `first-microservice` and `second-microservice`
3. `springcloud-gateway`, then call the services through http://localhost:8080/first/... and http://localhost:8080/second/...

```bash
cd Eurekaserver && ./mvnw spring-boot:run
```

## Tech stack

Java 17 · Spring Boot 3.1.2 · Spring Cloud Gateway · Netflix Eureka · OpenFeign · Maven
