FROM eclipse-temurin:17-jdk-alpine as build
WORKDIR /workspace/app

COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .
COPY src src

RUN chmod +x mvnw && ./mvnw install -DskipTests
RUN mkdir -p target/dependency && (cd target/dependency; jar -xf ../*.jar)

FROM eclipse-temurin:17-jdk-alpine

ARG DEPENDENCY=/workspace/app/target/
COPY --from=build ${DEPENDENCY}/simple-dockerfile-example-0.0.1-SNAPSHOT.jar .
ENTRYPOINT ["java","-jar","simple-dockerfile-example-0.0.1-SNAPSHOT.jar"]