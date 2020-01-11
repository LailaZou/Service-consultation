FROM openjdk:8
ADD target/serrvice-contrat-0.0.1-SNAPSHOT.jar serrvice-contrat-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/serrvice-contrat-0.0.1-SNAPSHOT.jar"]
EXPOSE 9854
