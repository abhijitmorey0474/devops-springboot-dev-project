FROM eclipse-temurin:18
COPY target/*.jar devops-app.jar
EXPOSE 9090
VOLUME /tmp
ENTRYPOINT ["java", "-jar", "devops-app.jar"]