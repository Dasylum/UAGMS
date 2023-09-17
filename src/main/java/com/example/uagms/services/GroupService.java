package com.example.uagms.services;

import com.example.uagms.models.Group;
import com.example.uagms.repositories.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupService {
    @Autowired
    GroupRepository groupRepository;

    public Group createGroup(Group group) {return groupRepository.save(group);}
}
