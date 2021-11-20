package com.medhead.controller;

import com.medhead.model.GroupOfSpeciality;
import com.medhead.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/group")
public class GroupController {

    @Autowired
    private GroupService groupService;

    @GetMapping
    public List<GroupOfSpeciality> getAllGroupOfSpecialities(){
        return groupService.getAllGroups();
    }

    @PostMapping
    public ResponseEntity<GroupOfSpeciality> saveGroupOfSpeciality(@RequestBody GroupOfSpeciality group){
        return new ResponseEntity<GroupOfSpeciality>(groupService.saveGroupe(group), HttpStatus.CREATED);
    }
}
