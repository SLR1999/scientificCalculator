FROM alpine/git as clone
WORKDIR /app
RUN git clone https://github.com/SLR1999/scientificCalculator.git

FROM maven:3.6-jdk-8-alpine as build
WORKDIR /app
COPY --from=clone /app/scientificCalculator /app
RUN mvn clean install

FROM openjdk:8-jre-alpine
WORKDIR /app
COPY --from=build app/target/scientificCalculator-1.0-SNAPSHOT.jar /app/scientificCalculator-1.0-SNAPSHOT.jar
CMD ["java","-jar", "./scientific_calculator_devops-1.0-SNAPSHOT.jar"]