FROM openjdk:latest
LABEL Samuka Navarro
COPY build/libs/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
