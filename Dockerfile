# 基础镜像 表示基镜像是openjdk:8-jre
FROM openjdk:8-jdk-alpine
ARG JAR_FILE
ADD ${JAR_FILE} app.jar
ENTRYPOINT [ "java", "-jar", "/app.jar"]