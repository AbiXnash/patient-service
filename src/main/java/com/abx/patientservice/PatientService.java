package com.abx.patientservice;

import org.springframework.stereotype.Service;

import com.abx.patientservice.repository.PatientRepository;

@Service
public class PatientService {

    private PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
	this.patientRepository = patientRepository;
    }
}
