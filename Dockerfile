# Use an official Maven image as a base
FROM openjdk:17-alpine

RUN apk update && apk add bash
# Set the working directory in the container
WORKDIR /app

# Copy the project source
COPY target/firstjunitpro-0.0.1-SNAPSHOT.jar /app


# Expose port 8080 to the outside world
EXPOSE 8080

# Command to run the application
CMD ["java", "-jar", "firstjunitpro-0.0.1-SNAPSHOT.jar"]
