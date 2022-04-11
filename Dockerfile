FROM openjdk:11-jdk
MAINTAINER "Ruben Leerentveld"
EXPOSE 8080
COPY target/mlbcenter-0.0.1-SNAPSHOT.jar mlbcenter-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "mlbcenter-0.0.1-SNAPSHOT.jar"]
