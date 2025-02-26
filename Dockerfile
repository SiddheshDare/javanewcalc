FROM openjdk:latest

# Set the working directory
WORKDIR /app

# Copy the source code into the container
COPY . /app/

# Install Maven to build the Java project
RUN apt-get update && apt-get install -y maven

# Build the Java application
RUN mvn clean install

# Set the default command to run the application
CMD ["java", "-jar", "target/ScientificCalculator.jar"]

