FROM openjdk:17
WORKDIR /app

COPY target/product-0.0.1-SNAPSHOT.jar stockboosterMax-product.jar

ENTRYPOINT ["java","-jar","stockboosterMax-product.jar"]

EXPOSE 8080