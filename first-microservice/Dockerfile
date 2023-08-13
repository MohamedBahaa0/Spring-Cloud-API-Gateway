# Use a base image with Java 17
FROM openjdk:17-jdk-alpine

# Set the working directory
WORKDIR /app

# Copy the Microservice JAR file into the container
COPY target/first-microservice-0.0.1-SNAPSHOT.jar app.jar

# Expose the port that the Microservice runs on
EXPOSE 8081

# Run the Microservice JAR
CMD ["java", "-jar", "app.jar"]