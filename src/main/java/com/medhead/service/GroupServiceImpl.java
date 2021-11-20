package com.medhead.service;

import com.medhead.model.GroupOfSpeciality;
import com.medhead.repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupServiceImpl implements GroupService{

    @Autowired
    private GroupRepository groupRepository;

    @Override
    public List<GroupOfSpeciality> getAllGroups() {
        return groupRepository.findAll();
    }

    @Override
    public GroupOfSpeciality saveGroupe(GroupOfSpeciality group) {
        return groupRepository.save(group);
    }
}
