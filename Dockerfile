FROM adoptopenjdk:8-jre-hotspot

EXPOSE 8080

ADD target/shppingcart-0.0.1-SNAPSHOT.jar shppingcart-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","shppingcart-0.0.1-SNAPSHOT.jar"]