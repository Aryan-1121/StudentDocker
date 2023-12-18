FROM openjdk:17
# ADD location then space and then jar file name
ADD target/springboot-student-docker.jar springboot-student-docker.jar
ENTRYPOINT ["java","-jar","/springboot-student-docker.jar"]