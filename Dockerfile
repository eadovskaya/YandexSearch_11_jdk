FROM openjdk:11

RUN apt-get update
RUN apt-get -y install maven

WORKDIR /app

COPY pom.xml pom.xml
COPY ./src/ src/

RUN mvn dependency:resolve

# TODO: 2-stage build

ENTRYPOINT ["mvn", "test"]