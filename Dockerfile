FROM openjdk:8
EXPOSE 8080
ADD target/springboot-github-action.jar springboot-github-action.jar
ENTRYPOINT ["java","-jar","springboot-github-action.jar"]

#FROM openjdk:17-slim
#WORKDIR /app
#
#COPY build/libs/*.jar app.jar
#EXPOSE 8080  # Port to expose
#
#ENTRYPOINT ["java", "-jar", "app.jar"]
