FROM openjdk:19
EXPOSE 8080
ADD /target/app-jar-with-dependencies.jar app-jar-with-dependencies.jar
ENTRYPOINT ["java", "-jar", "/app-jar-with-dependencies.jar"]