package com.medhead.service;

import com.medhead.model.Patient;

import java.util.List;

public interface PatientService {
    List<Patient> getAllPatients();
    Double getPatientLatitudeById(Integer id);
    Double getPatientLongitudeById(Integer id);
}
