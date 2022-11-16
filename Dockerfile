FROM adoptopenjdk:11-jre-hotspot
CMD ["./mvnm package"]
ADD target/*.jar application.jar
ENTRYPOINT ["java","-jar","application.jar"]
EXPOSE 8090