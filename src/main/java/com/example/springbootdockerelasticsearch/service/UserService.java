package com.example.springbootdockerelasticsearch.service;

import com.example.springbootdockerelasticsearch.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    User saveUser(User user);
    User getByUserId(Long id);

    List<User> getByUser(String firstName, String lastName , String email);

    Iterable<User> getUsers();

}
