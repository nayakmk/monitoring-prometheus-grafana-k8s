FROM openjdk:17-jdk-alpine
MAINTAINER nayakmk.io
COPY build/libs/monitoring-k8s-0.0.1-SNAPSHOT.jar monitoring-k8s-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/monitoring-k8s-0.0.1-SNAPSHOT.jar"]