package com.medhead.controller;

import com.medhead.model.GroupOfSpeciality;
import com.medhead.model.Speciality;
import com.medhead.service.SpecialityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/speciality")
public class SpecialityController {

    @Autowired
    private SpecialityService specialityService;

    @GetMapping
    public List<Speciality> getAllSpecialities(){
        return specialityService.getAllSpecialities();
    }

    @PostMapping
    public ResponseEntity<Speciality> saveSpeciality(@RequestBody Speciality speciality){
        return new ResponseEntity<Speciality>(specialityService.saveSpeciality(speciality), HttpStatus.CREATED);
    }
}
