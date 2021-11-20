package com.medhead.service;

import com.medhead.model.Hospital;
import com.medhead.repository.HospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HospitalServiceImpl implements HospitalService{

    @Autowired
    private HospitalRepository hospitalRepository;

    @Override
    public List<Hospital> getAllHospitals() {
        return hospitalRepository.findAll();
    }

    @Override
    public Hospital saveHospital(Hospital hospital) {
        return hospitalRepository.save(hospital);
    }

}
