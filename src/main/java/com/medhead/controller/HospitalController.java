package com.medhead.controller;

import com.medhead.model.Hospital;

import com.medhead.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hospital")
public class HospitalController {

    @Autowired
    private HospitalService hospitalService;

    @GetMapping
    public List<Hospital> getAllHospitals(){
        return hospitalService.getAllHospitals();
    }

    @PostMapping
    public ResponseEntity<Hospital> saveHospital(@RequestBody Hospital hospital){
        return new ResponseEntity<Hospital>(hospitalService.saveHospital(hospital), HttpStatus.CREATED);
    }

}
