package com.abx.patientservice.mapper;

import java.time.LocalDate;

import com.abx.patientservice.dto.PatientRequestDTO;
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

    public static Patient toModel(PatientRequestDTO patientRequestDTO) {
	Patient patient = new Patient();

	patient.setName(patientRequestDTO.getName());
	patient.setAddress(patientRequestDTO.getAddress());
	patient.setEmail(patientRequestDTO.getEmail());
	patient.setDateOfBirth(LocalDate.parse(patientRequestDTO.getDateOfBirth()));
	patient.setRegistedDate(LocalDate.parse(patientRequestDTO.getRegisteredDate()));

	return patient;
    }
}