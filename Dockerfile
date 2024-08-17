# Use a base image that includes JDK 17
FROM openjdk:17-jdk-slim
LABEL authors="Chaoscrider"

# Set the working directory in the container
WORKDIR /app

# Copy the built JAR file into the container
COPY /target/StockVisioBackEnd-0.0.1-SNAPSHOT.jar app.jar

# Expose the port that the Spring Boot app runs on
EXPOSE 8080

# Run the JAR file
ENTRYPOINT ["java", "-jar", "app.jar"]