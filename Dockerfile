FROM amazoncorretto:17-alpine-jdk

COPY target/demo-0.0.1-SNAPSHOT.jar demo.jar

ENTRYPOINT ["java", "-jar","/demo.jar"]
