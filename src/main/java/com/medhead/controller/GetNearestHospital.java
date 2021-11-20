package com.medhead.controller;

import com.medhead.model.Hospital;
import com.medhead.repository.HospitalRepository;
import com.medhead.service.HospitalService;
import com.medhead.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GetNearestHospital {

    @Autowired
    private PatientService patientService;

    @Autowired
    private HospitalRepository hospitalRepository;

    @GetMapping("/patientaddress/{id}")
    public double getPatientAddress(@PathVariable(value = "id") Integer id){
        double patientLatitude = patientService.getPatientLatitudeById(id);
        double patientLongitude = patientService.getPatientLongitudeById(id);
        return 0;
    }

}
