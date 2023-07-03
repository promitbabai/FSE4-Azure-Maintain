FROM openjdk:11-jre-slim
ARG JAR_FILE= target/*.jar
COPY ./target/skill-tracker-maintain-1.0.0.jar app.jar
ENTRYPOINT ["java","-jar","./app.jar"]