FROM openjdk:8
EXPOSE 8761
ADD target/student-registry-service-0.0.1-SNAPSHOT.jar student-registry-service-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/student-registry-service-0.0.1-SNAPSHOT.jar"]