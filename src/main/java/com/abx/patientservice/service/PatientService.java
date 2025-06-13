package com.abx.patientservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.abx.patientservice.dto.PatientRequestDTO;
import com.abx.patientservice.dto.PatientResponseDTO;
import com.abx.patientservice.exception.EmailAlreadyExistsException;
import com.abx.patientservice.mapper.PatientMapper;
import com.abx.patientservice.model.Patient;
import com.abx.patientservice.repository.PatientRepository;

@Service
public class PatientService {

    private final PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
	this.patientRepository = patientRepository;
    }

    public List<PatientResponseDTO> getPatients() {
	List<Patient> patients = patientRepository.findAll();
	return patients.stream().map(PatientMapper::toDTO).toList();
    }

    public PatientResponseDTO createPatient(PatientRequestDTO patientRequestDTO) {
	if (patientRepository.existsByEmail(patientRequestDTO.getEmail())) {
	    throw new EmailAlreadyExistsException(
		    "A patient with this email " + patientRequestDTO.getEmail() + " already exists!!!");
	}
	Patient newPatient = patientRepository.save(PatientMapper.toModel(patientRequestDTO));
	return PatientMapper.toDTO(newPatient);
    }
}
