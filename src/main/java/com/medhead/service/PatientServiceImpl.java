package com.medhead.service;

import com.medhead.model.Patient;
import com.medhead.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService{

    @Autowired
    private PatientRepository patientRepository;

    @Override
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    @Override
    public Double getPatientLatitudeById(Integer id) {

        Patient patient = new Patient();
        try{
            patient = patientRepository.findById(id).orElse(null);
        } catch (Exception e){
            e.printStackTrace();
        }
        return patient.getLatitude();
    }

    @Override
    public Double getPatientLongitudeById(Integer id) {

        Patient patient = new Patient();
        try{
            patient = patientRepository.findById(id).orElse(null);
        } catch (Exception e){
            e.printStackTrace();
        }
        return patient.getLongitude();
    }
}
