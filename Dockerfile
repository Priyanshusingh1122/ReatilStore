FROM openjdk:11
EXPOSE 8000
ADD target/retailstoretest.jar retailstoretest.jar
ENTRYPOINT ["java","-jar","/retailstoretest.jar"]