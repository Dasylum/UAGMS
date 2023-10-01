package com.example.uagms.controllers;

import com.example.uagms.models.Group;
import com.example.uagms.services.GroupService;
import com.example.uagms.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "/groups")
public class GroupController {
    @Autowired
    private GroupService groupService;

    @Autowired
    private UserService userService;

    @PostMapping(value = "/new")
    public Group createGroup(@RequestBody Group groupInfo) {
        try {
            Group newGroup = new Group();
            newGroup.setName(groupInfo.getName());

            return groupService.createGroup(newGroup);
        } catch (Error e) {
            System.out.print(e);
        }
        return null;
    }

    @GetMapping(value = "")
    public List<Group> getGroups() {
        return groupService.findAllGroups();
    }
}
