# Use openjdk base image (JDK 11)
FROM openjdk:11-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the entire project into the container
COPY . /app/

# Install Maven to build the Java project
RUN apt-get update && apt-get install -y maven

# Build the Java application using Maven
RUN mvn clean install

# Run the application using the generated JAR file
CMD ["java", "-jar", "target/javacalc-1.0-SNAPSHOT.jar"]
