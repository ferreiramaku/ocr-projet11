package com.medhead.service;

import com.medhead.model.Speciality;
import com.medhead.repository.SpecialityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpecialityServiceImpl implements SpecialityService{

    @Autowired
    private SpecialityRepository specialityRepository;

    @Override
    public List<Speciality> getAllSpecialities() {
        return specialityRepository.findAll();
    }

    @Override
    public Speciality saveSpeciality(Speciality speciality) {
        return specialityRepository.save(speciality);
    }
}
