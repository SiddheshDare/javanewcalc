# Use openjdk base image
FROM openjdk:11-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the entire project (including the pom.xml and Java source files) into the container
COPY . /app/

# Install Maven
RUN apt-get update && apt-get install -y maven

# Build the Java application using Maven (Assumes pom.xml is present)
RUN mvn clean install

# Set the default command to run the Java application directly
CMD ["java", "-cp", "target/classes", "org.example.ScientificCalculator"]
