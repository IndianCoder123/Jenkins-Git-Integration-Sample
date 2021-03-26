FROM openjdk:8
expose 8080
ADD target/jenkins-git-integration.jar jenkins-git-integration.jar
ENTRYPOINT ["java","-jar","/jenkins-git-integration.jar"]
