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

//    @PostMapping(value = "/")
//    public List<User> getUserGroups(@RequestBody UUID user_id, String user_name, String password) {
//        return userService.getUserGroups();
//    }
}
