FROM openjdk:11.0.6-jdk
WORKDIR app
WORKDIR uploads
COPY target/DockerVolumnSpringboot-0.0.1-SNAPSHOT.jar /app/application.jar
COPY ImageTest.jpg /app/ImageTest.jpg
EXPOSE 8080
CMD ["java", "-jar", "/app/application.jar"]