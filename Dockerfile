FROM openjdk:8
EXPOSE 8081
ADD ./target/untitled1-1.0-SNAPSHOT.jar untitled1-1.0-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/untitled1-1.0-SNAPSHOT.jar"]