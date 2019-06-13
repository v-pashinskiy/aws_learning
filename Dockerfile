FROM openjdk:11-jdk
MAINTAINER Volodymyr Pashynskyi
ARG jarFile
ADD ${jarFile} /app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app.jar"]


