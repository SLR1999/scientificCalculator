FROM openjdk:8
COPY ./target/scientificCalculator-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java","-cp", "scientificCalculator-1.0-SNAPSHOT-jar-with-dependencies.jar", "Calculator"]