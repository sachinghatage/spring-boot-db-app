FROM openjdk:11
COPY target/spring-boot-db-app-1.1.jar /usr/app/spring-boot-db-app-1.1.jar
WORKDIR /usr/app
ENTRYPOINT ["java","-jar","spring-boot-db-app-1.1.jar"]