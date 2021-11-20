package com.medhead.service;

import com.medhead.model.Speciality;

import java.util.List;

public interface SpecialityService {
    List<Speciality> getAllSpecialities();
    Speciality saveSpeciality(Speciality speciality);
}
