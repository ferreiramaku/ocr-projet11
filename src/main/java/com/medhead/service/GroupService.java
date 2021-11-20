package com.medhead.service;

import com.medhead.model.GroupOfSpeciality;

import java.util.List;

public interface GroupService {
    List<GroupOfSpeciality> getAllGroups();
    GroupOfSpeciality saveGroupe(GroupOfSpeciality group);
}
