package com.example.springbootdockerelasticsearch.service;

import com.example.springbootdockerelasticsearch.model.User;
import com.example.springbootdockerelasticsearch.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;


    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getByUserId(Long id) {
        return userRepository.findById(id).orElseThrow();
    }

    @Override
    public List<User> getByUser(String firstName, String lastName , String email) {
        return userRepository.findByFirstNameLikeOrLastNameLikeOrEmail(firstName,lastName,email);
    }

    @Override
    public Iterable<User> getUsers() {
        return userRepository.findAll();
    }


}
