FROM openjdk:21-slim

RUN apt-get update && \
    apt-get install -y curl

ENV MAVEN_VERSION 3.8.4
RUN mkdir /opt/maven && \
    curl -fsSL https://archive.apache.org/dist/maven/maven-3/${MAVEN_VERSION}/binaries/apache-maven-${MAVEN_VERSION}-bin.tar.gz | tar -xzC /opt/maven --strip-components=1 && \
    ln -s /opt/maven/bin/mvn /usr/bin/mvn

ENV JAVA_HOME /usr/local/openjdk-21
ENV MAVEN_HOME /opt/maven
ENV PATH $PATH:/opt/maven/bin

WORKDIR /app

COPY . /app

RUN mvn clean install -DskipTests

CMD ["java", "-jar", "target/rule-indexer-0.0.1-SNAPSHOT.jar", "samples/file1.txt", "samples/file2.html"]
