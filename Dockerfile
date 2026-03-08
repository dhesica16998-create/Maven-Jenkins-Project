FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY target/first-maven-1.0-SNAPSHOT.jar app.jar
CMD ["java","-cp","app.jar","com.dhesica.App"]