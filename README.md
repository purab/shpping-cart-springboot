Example code of shopping Cart using Spring boot + Thymeleaf

Code has this features:
1. Registration
2. Google Login
3. DB login
4. Admin and User Role management
5. Products Listing
6. Product Category
7. Cart
8. Checkout
9. Admin Dashboard
10. Shopping Page
11. View Product

Docker file add in this project and k8s deployment file is added

Some docker commands
1. You can run the application by using this command on terminal
```
./mvnw spring-boot:run
```
2. 3. For creating jar need to run this command 
```
./mvnw clean package
```
3. jar will create in build/libs folder
4. you can run app using this command with jar
```
java -jar target/shoppingcart-0.0.1-SNAPSHOT.jar
```
5. create file named "Dockerfile"

create docker image with docker file
```shell
#cd d:\workspace\shopping-cart-springboot
#docker build -t shopping-cart-springboot:v1 .
```

Give tag to docker image and push image to docker hub
```shell
#docker tag shopping-cart-springboot purabdk/shopping-cart-springboot
#docker push purabdk/shopping-cart-springboot
```

remove docker images from local docker hub
```shell
#docker rmi docker-spring purabdk/shopping-cart-springboot
```

docker pull image from docker hub and run it
```shell
#docker run -p 8080:8080 purabdk/shopping-cart-springboot
```

check running container
```shell
#docker ps
```

stop running container
```shell
#docker stop CONTAINER_ID
```

# Jenkins
Ref:
[Jenkins War Download](https://www.jenkins.io/download/)
[Jenkins Doc](https://www.jenkins.io/doc/book/installing/initial-settings/)


Start jenkins on local machine

```
wsl
java -jar /mnt/c/NON-INSTALLED-SOFTWARES/jenkins.war --httpPort=9090
```

go to http://localhost:9090/pluginManager/ for installing docker related plugins
Docker, Docker Pipeline,docker-build-step,CloudBees Docker Build and Publish

//Note: use Multibranch pipeline and just put your git repo url.
Do variable changes and you can use jenkins build with docker image push..

# SSL certificate integration

SSL certificate setting applied in application.properties file
To generate self signed SSL certificate use following command:
```
cd src/resources
keytool -genkeypair -alias local_ssl -keyalg RSA -keysize 2048 -storetype PKCS12 -keystore loacal-ssl.p12 -validity 365 -ext san=dns:localhost
```

For production use following command and use p12 file in application
Convert .crt to .p12
```
openssl pkcs12 -export -out server.p12 -inkey server.key -in server.crt
```
Where server.key , is the server key . server.crt is cert file from CA or self sigh