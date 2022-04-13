FROM openjdk:11

RUN apt-get update
RUN apt-get -y install maven

WORKDIR /app

COPY pom.xml pom.xml

RUN mvn -B dependency:resolve dependency:resolve-plugins

COPY ./src/ src/

RUN mvn install -DskipTests dependency:resolve dependency:resolve-plugins

ENTRYPOINT ["mvn", "test"]