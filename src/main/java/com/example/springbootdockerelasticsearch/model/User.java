package com.example.springbootdockerelasticsearch.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Document(indexName = "users")
@Builder
public class User {

    @Id
    @Field(type = FieldType.Keyword)
    private Long id;

    @Field(name = "firstName", type = FieldType.Text)
    private String firstName;

    @Field(name = "lastName", type = FieldType.Text)
    private String lastName;

    @Field(name = "email" ,type = FieldType.Text)
    private String email;

    @Field(name = "age", type = FieldType.Integer)
    private int age;
}
