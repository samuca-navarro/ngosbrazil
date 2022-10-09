FROM openjdk:latest
LABEL Samuka Navarro
COPY /build/libs/ngosbrazil-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
EXPOSE 8080

