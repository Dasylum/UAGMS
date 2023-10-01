package com.example.uagms.controllers;

import com.example.uagms.models.Group;
import com.example.uagms.models.User;
import com.example.uagms.models.UserGroup;
import com.example.uagms.repositories.GroupRepository;
import com.example.uagms.repositories.UserRepository;
import com.example.uagms.services.UserGroupService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping(value = "/usergroup")
public class UserGroupController {
    @Autowired
    UserGroupService userGroupService;

    @Autowired
    UserRepository userRepository;

    @Autowired
    GroupRepository groupRepository;

    @PostMapping(path = "/new")
    public UserGroup newUserGroup(@RequestBody UserGroup userGroup) {
        //Find user
        UUID user_id = userGroup.getUser().getId();
        UUID group_id = userGroup.getGroup().getId();
        Optional<User> user = userRepository.findById(user_id);
        //Find group
        Optional<Group> group = groupRepository.findById(group_id);

        // Check if both User and Group are present before creating UserGroup
        UserGroup temp = userGroupService.createUserGroup(user.get(), group.get());

        return temp;
    }

    @GetMapping(value = "/")
    public List<UserGroup> getAllUserGroup() {
        return userGroupService.findAllUserGroups();
    }
}
