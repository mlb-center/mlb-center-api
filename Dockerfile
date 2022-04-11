FROM openjdk:17-jdk
MAINTAINER "Ruben Leerentveld"
EXPOSE 9001
COPY target/mlbcenter-0.0.1-SNAPSHOT.jar mlbcenter-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "mlbcenter-0.0.1-SNAPSHOT.jar"]
