FROM maven:3.5-jdk-8-slim
EXPOSE 8080

WORKDIR /usr/src/app

COPY pom.xml .
COPY multiple-module-entity/pom.xml ./multiple-module-entity/
COPY multiple-module-service/pom.xml ./multiple-module-service/
COPY multiple-module-web/pom.xml ./multiple-module-web/
RUN ["/usr/local/bin/mvn-entrypoint.sh", "mvn", "verify", "--fail-never"]
COPY . .
RUN ["mvn", "package"]

CMD ["java", "-jar", "multiple-module-web/target/multiple-module-web-0.0.1-SNAPSHOT.jar"]