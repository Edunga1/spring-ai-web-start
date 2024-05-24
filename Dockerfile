FROM --platform=linux/amd64 eclipse-temurin:17-jdk-alpine AS build
WORKDIR /workspace/app

COPY . /workspace/app
RUN --mount=type=cache,target=/root/.gradle ./gradlew clean build

FROM --platform=linux/amd64 eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY --from=build /workspace/app/build/libs/*-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
