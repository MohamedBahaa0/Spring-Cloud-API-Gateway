# Use a base image with Java 17
FROM openjdk:17-jdk-alpine

# Set the working directory
WORKDIR /app

# Copy the Eureka Server JAR file into the container
COPY target/eurekaserver-0.0.1-SNAPSHOT.jar app.jar

# Expose the port that Eureka Server runs on
EXPOSE 8761

# Run the Eureka Server JAR
CMD ["java", "-jar", "app.jar"]