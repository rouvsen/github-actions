FROM amazoncorretto:17-alpine
COPY ./target/*.jar /app/app.jar
WORKDIR /app
ENTRYPOINT ["java"]
CMD ["-jar", "app.jar"]