package com.example.springbootdockerelasticsearch.controller;


import com.example.springbootdockerelasticsearch.model.User;
import com.example.springbootdockerelasticsearch.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;


    @PostMapping("/create")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        return new ResponseEntity<>(userService.saveUser(user), HttpStatus.CREATED);
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<User> getByUserId(@PathVariable Long id) {
        return new ResponseEntity<>(userService.getByUserId(id), HttpStatus.CREATED);
    }

    @GetMapping("/{search}")
    public ResponseEntity<List<User>> getByUser(@PathVariable String search) {
        List<User> userList = userService.getByUser(search, search, search);
        return ResponseEntity.ok(userList);

    }

    @GetMapping("/userList")
    public ResponseEntity<Iterable<User>> userList() {
        Iterable<User> users = userService.getUsers();
        return ResponseEntity.ok(users);
    }


}
