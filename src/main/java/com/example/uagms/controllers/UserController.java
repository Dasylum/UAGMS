package com.example.uagms.controllers;

import com.example.uagms.models.Group;
import com.example.uagms.models.User;
import com.example.uagms.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "/")
    public List<User> findAll() {
        return userService.findAllUsers();
    }

    @PostMapping(value = "/new")
    public User createAUser(@RequestBody User userInfo) {
        User newUser = new User();
        newUser.setUser_name(userInfo.getUser_name());
        newUser.setUser_id(userInfo.getUser_id());

        return userService.createUser(newUser);
    }
}
