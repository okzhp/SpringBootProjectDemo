FROM java:8
WORKDIR /app
COPY service-module-01/target/service-module-01-1.0-SNAPSHOT.jar /app/
CMD nohup java -jar service-module-01-1.0-SNAPSHOT.jar