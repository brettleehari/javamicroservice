# Use a JDK image to build and run the application
FROM openjdk:11-jdk-slim

WORKDIR /app

# Copy the POM file and source code
COPY pom.xml .
COPY src ./src

# Install Maven
RUN apt-get update && apt-get install -y maven && rm -rf /var/lib/apt/lists/*

# Build the application
RUN mvn clean package

# Copy the JAR file into the image
COPY target/SimpleJavaMicroserviceApp-1.0-SNAPSHOT.jar app.jar

# Expose the port the app runs on
EXPOSE 8080

# Command to run the JAR file
ENTRYPOINT ["java", "-jar", "app.jar"]
