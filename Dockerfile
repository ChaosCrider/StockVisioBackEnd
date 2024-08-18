# Stage 1: Build Stage
FROM maven:3-eclipse-temurin-17 AS build
WORKDIR /
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Stage 2: Runtime Stage
FROM eclipse-temurin:17-alpine
WORKDIR /
COPY --from=build /target/StockVisioBackEnd-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080

RUN echo $PATH
RUN which java

ENTRYPOINT ["java", "-jar", "app.jar"]
