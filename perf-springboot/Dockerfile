FROM maven:3.6.2-jdk-8 AS build

RUN mkdir /app

COPY . /app/
WORKDIR /app

RUN mvn clean package -DskipTest

FROM openjdk:8-jdk-alpine
VOLUME /tmp

RUN mkdir /app
COPY --from=build /app/target/*.jar /app/app.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Dspring.profiles.active=prd","-jar","/app/app.jar"]