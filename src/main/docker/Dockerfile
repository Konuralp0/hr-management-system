FROM openjdk:23-slim

WORKDIR /app

COPY hrms-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080
ENV POSTGRES localhost

CMD ["java", "-jar", "app.jar"]
