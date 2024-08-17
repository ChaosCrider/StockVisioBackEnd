# Use a base image that includes JDK
FROM openjdk:22-jdk-slim
LABEL authors="Chaoscrider"

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file into the container
COPY target/your-app.jar app.jar

# Run the JAR file
ENTRYPOINT ["java", "-jar", "app.jar"]