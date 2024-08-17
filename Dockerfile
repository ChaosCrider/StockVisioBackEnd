# Use a base image that includes JDK
FROM openjdk:17-jdk-slim
LABEL authors="Chaoscrider"

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file into the container
COPY target/StockVisioBackEnd-0.0.1-SNAPSHOT.jar app.jar

# Run the JAR file
ENTRYPOINT ["java", "-jar", "app.jar"]
