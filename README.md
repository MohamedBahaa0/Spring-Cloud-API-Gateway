# Spring API Gateway Project

This project showcases the setup of a Spring Cloud Gateway acting as a routing layer between multiple microservices registered with Eureka Server.

## Overview

The repository contains the following components:

1. **Eureka Server**: A service registry for registering and discovering microservices.
2. **Spring Cloud Gateway**: A gateway that routes incoming requests to appropriate microservices based on configured predicates.
3. **Microservice 1**: An example microservice exposing APIs.
4. **Microservice 2**: Another example microservice that communicates with Microservice 1 using Feign Client.

## Project Structure

- `eurekaserver`: Contains the Eureka Server setup.
- `api-gateway`: Includes the Spring Cloud Gateway setup with routing configuration.
- `first-microservice`: An example microservice with exposed APIs.
- `second-microservice`: An example microservice using Feign Client to call APIs of the first microservice.

## How to Run

1. Start the Eureka Server:
    - Navigate to the `eurekaserver` directory.
    - Run the Spring Boot application to start the Eureka Server.

2. Start Microservices:
    - Navigate to `first-microservice` and `second-microservice` directories.
    - Run the Spring Boot applications for both microservices.

3. Start the Spring Cloud Gateway:
    - Navigate to the `api-gateway` directory.
    - Run the Spring Boot application for the gateway.

4. Access Microservices through Gateway:
    - Use the gateway URL (default: http://localhost:8080) to access the microservices.

## Usage

- Eureka Server: http://localhost:8761
- Spring Cloud Gateway: http://localhost:8080
- Microservice 1: http://localhost:8081
- Microservice 2: http://localhost:8082

## Additional Notes

- Modify the routing configuration in `api-gateway` to suit your microservices and requirements.
- Explore the code in each microservice directory for more insights on how they are implemented.


