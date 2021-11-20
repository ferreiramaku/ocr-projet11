package com.medhead.service;

import com.medhead.model.Hospital;
import com.medhead.model.Speciality;


import java.util.List;

public interface HospitalService {
    List<Hospital> getAllHospitals();
    Hospital saveHospital(Hospital hospital);
}
