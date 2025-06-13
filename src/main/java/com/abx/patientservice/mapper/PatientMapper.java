package com.abx.patientservice.mapper;

import com.abx.patientservice.dto.PatientResponseDTO;
import com.abx.patientservice.model.Patient;

public class PatientMapper {
    public static PatientResponseDTO toDTO(Patient patient) {
	PatientResponseDTO patientDTO = new PatientResponseDTO();
	patientDTO.setId(patient.getId().toString());
	patientDTO.setName(patient.getName());
	patientDTO.setEmail(patient.getEmail());
	patientDTO.setAddress(patient.getAddress());
	patientDTO.setDateOfBirth(patient.getDateOfBirth().toString());

	return patientDTO;
    }
}