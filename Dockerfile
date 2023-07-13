FROM openjdk:17
COPY target/spring-boot-angular-1.0.jar /tmp
WORKDIR /tmp
EXPOSE 8080
CMD java -jar spring-boot-angular-1.0.jar
