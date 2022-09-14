# 🎯 Elasticsearch  

<img src = "https://github.com/rasitesdmr/springboot-docker-elasticsearch/blob/master/image/es1.jpg">

## 📌 docker-compose.yaml

```yaml
docker-compose up --build -d
```
```yaml
docker-compose down -v
```

## 📌 Elasticsearch Maven Dependencies

```xml
<dependency>
    <groupId>org.springframework.data</groupId>
    <artifactId>spring-data-elasticsearch</artifactId>
    <version>4.0.0.RELEASE</version>
</dependency>
```

## 📌 Elasticsearch Service
* http://localhost:9200 
* http://localhost:9200/users/_settings
* http://localhost:9200/users/_search?pretty=true&q=*:*

## 📌 Services
* http://localhost:8080/user/{search}

## 📌 Swagger
* http://localhost:8080/swagger-ui/index.html

<img src="https://github.com/rasitesdmr/springboot-docker-elasticsearch/blob/master/image/es2.jpeg">
<img src="https://github.com/rasitesdmr/springboot-docker-elasticsearch/blob/master/image/es3.png" >