package com.example.springbootdockerelasticsearch.repository;


import com.example.springbootdockerelasticsearch.model.User;
import org.springframework.data.elasticsearch.annotations.Query;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserRepository extends ElasticsearchRepository<User, Long> {

    @Query("{\"bool\": {\"must\": [{\"match\": {\"firstName\": \"?0\"}}]}}")
    List<User> getByCustomQuery(String firstName);

    List<User>findByFirstNameLikeOrLastNameLikeOrEmail(String firstName, String lastName , String email );

}
