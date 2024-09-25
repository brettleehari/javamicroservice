# Use an official OpenJDK runtime as a parent image
FROM openjdk:8-jdk-alpine

# Set the working directory in the container
WORKDIR /app

# Copy the current directory contents into the container at /app
COPY . /app

# Install Maven
RUN apk add --no-cache maven

# Build the application
RUN mvn package

# Run the application
CMD ["java", "-jar", "target/SimpleJavaApp-1.0-SNAPSHOT.jar"]
