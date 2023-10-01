package com.example.uagms.services;

import com.example.uagms.models.Group;
import com.example.uagms.repositories.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class GroupService {
    @Autowired
    GroupRepository groupRepository;

    public Group createGroup(Group group) {return groupRepository.save(group);}

    public Group findGroupById(UUID group_id) {return groupRepository.findById(group_id).get();}

    public List<Group> findAllGroups() { return groupRepository.findAll(); }
}
