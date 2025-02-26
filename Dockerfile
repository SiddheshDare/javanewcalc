# Use openjdk 17 base image
FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the entire project into the container
COPY . /app/

# Install Maven
RUN apt-get update && apt-get install -y maven

# Build the Java application using Maven
RUN mvn clean install

# Run the application using the generated JAR file
CMD ["java", "-jar", "target/javacalc-1.0-SNAPSHOT.jar"]
