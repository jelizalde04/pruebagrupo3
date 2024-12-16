FROM openjdk:17-jdk-slim
COPY target/resthotel-0.0.1-SNAPSHOT.jar app_resthotel.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app_resthotel.jar"]