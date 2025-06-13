package com.abx.patientservice;

import java.util.List;

import org.springframework.stereotype.Service;

import com.abx.patientservice.dto.PatientResponseDTO;
import com.abx.patientservice.mapper.PatientMapper;
import com.abx.patientservice.model.Patient;
import com.abx.patientservice.repository.PatientRepository;

@Service
public class PatientService {

    private PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
	this.patientRepository = patientRepository;
    }

    public List<PatientResponseDTO> getPatients() {
	List<Patient> patients = patientRepository.findAll();
	return patients.stream().map(PatientMapper::toDTO).toList();
    }
}
