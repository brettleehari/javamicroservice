# JavaMicroservice

This is a simple Java application built using Maven and Dockerized to run as a microservice.

## Prerequisites

- Java 8 or higher
- Maven 3.6.0 or higher
- Docker
- Git

## Project Structure
# javamicroservice
SimpleJavaApp ├── Dockerfile ├── docker-compose.yml ├── pom.xml └── src └── main ├── java │ └── com │ └── example │ └── App.java └── test └── java └── com └── example └── AppTest.java


## Building the Project

1. **Clone the repository**:
    ```bash
    git clone https://github.com/brettleehari/javamicroservice.git
    cd javamicroservice
    ```

2. **Build the project using Maven**:
    ```bash
    mvn clean package
    ```

## Running the Application Locally

1. **Run the application**:
    ```bash
    java -jar target/SimpleJavaApp-1.0-SNAPSHOT.jar
    ```

2. **Access the application**:
    - If your application is a web service, open a web browser and navigate to `http://localhost:8080`.

## Dockerizing the Application

1. **Build the Docker image**:
    ```bash
    docker build -t simple-java-app .
    ```

2. **Run the Docker container**:
    ```bash
    docker run -p 8080:8080 simple-java-app
    ```

3. **Access the application**:
    - Open a web browser and navigate to `http://localhost:8080`.

## Running the Application as a Microservice

1. **Using Docker Compose**:
    - Ensure your `docker-compose.yml` file is set up correctly:
      ```yaml
      version: '3'
      services:
        javaapp:
          build: .
          ports:
            - "8080:8080"
      ```

2. **Start the services**:
    ```bash
    docker-compose up --build
    ```

3. **Access the application**:
    - Open a web browser and navigate to `http://localhost:8080`.
    - Or use curl http://localhost:8080


## Alternative: Using Docker Build and Docker Run

1. **Build the Docker image**:
    ```bash
    docker build -t javaapp .
    ```

2. **Run the Docker container**:
    ```bash
    docker run -p 8080:8080 javaapp
    ```

3. **Access the application**:
    - Open a web browser and navigate to `http://localhost:8080`.
    - Or use curl http://localhost:8080

## Troubleshooting

- **Permission Issues**: Ensure you have the necessary permissions to push to the repository and that your SSH keys are correctly configured.
- **Port Conflicts**: Ensure that port 8080 is not being used by another application.

## Contributing

1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Make your changes.
4. Commit your changes (`git commit -am 'Add new feature'`).
5. Push to the branch (`git push origin feature-branch`).
6. Create a new Pull Request.

## License

This project is licensed under the MIT License - see the LICENSE file for details.