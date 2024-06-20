FROM amazoncorretto:17-alpine3.19
ARG JAR_FILE_PATH=target/spring-boot-hello-world*.jar
COPY ${JAR_FILE_PATH} app.jar
ENTRYPOINT ["java", "-jar", "-Dserver.port=8082", "app.jar"]
