package com.example.springbootdockerelasticsearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@SpringBootApplication
@EnableElasticsearchRepositories
public class SpringbootDockerElasticsearchApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDockerElasticsearchApplication.class, args);
    }

}
