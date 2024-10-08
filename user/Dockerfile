FROM openjdk:11-jre-slim

WORKDIR /app

COPY target/user-0.0.1-SNAPSHOT.jar stockboosterMax-user.jar

ENTRYPOINT ["java","-jar","stockboosterMax-user.jar"]