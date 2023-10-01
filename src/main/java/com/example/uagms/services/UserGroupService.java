package com.example.uagms.services;

import com.example.uagms.models.Group;
import com.example.uagms.models.User;
import com.example.uagms.models.UserGroup;
import com.example.uagms.repositories.UserGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserGroupService {
    @Autowired
    UserGroupRepository userGroupRepository;

    public UserGroup createUserGroup(User user, Group group) {
        UserGroup newUserGroup = new UserGroup(user.getId(), group.getId());
        newUserGroup.setUser(user);
        newUserGroup.setGroup(group);
        UserGroup temp = userGroupRepository.save(newUserGroup);
        return temp;
    }

    public List<UserGroup> findAllUserGroups() {
        return userGroupRepository.findAll();
    }
}
