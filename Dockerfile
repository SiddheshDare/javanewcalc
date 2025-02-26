# Use openjdk base image
FROM openjdk:11-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the Java source code into the container
COPY . /app/

# Install Maven
RUN apt-get update && apt-get install -y maven

# Build the Java application using Maven (Assumes pom.xml is present)
RUN mvn clean install

# Set the environment variable for the main class if needed
ENV MAIN_CLASS=org.example.ScientificCalculator

# Copy the calculator.sh script into the container
COPY calculator.sh /app/calculator.sh

# Ensure the script has execute permissions
RUN chmod +x /app/calculator.sh

# Set the default command to run the Java application
CMD ["java", "-cp", "target/*", "$MAIN_CLASS"]
