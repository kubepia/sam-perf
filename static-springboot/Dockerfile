FROM maven:3.6.2-jdk-8 AS build
COPY ./src /usr/src/app/src
COPY pom.xml /usr/src/app
RUN mvn -f /usr/src/app/pom.xml clean package

FROM openjdk:8-jdk-alpine
VOLUME /tmp

FROM openjdk:8-jdk-alpine

COPY --from=build /usr/src/app/target/*.jar /usr/app/app.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Dspring.profiles.active=prd","-jar","/usr/app/app.jar"]