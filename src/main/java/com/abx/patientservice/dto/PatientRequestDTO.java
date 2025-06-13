package com.abx.patientservice.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class PatientRequestDTO {

    @NotBlank(message = "Name is required")
    @Size(max = 100, message = "Max. limit is 100")
    private String name;

    @NotBlank(message = "Email is required")
    @Email(message = "Email should be valid")
    private String email;

    @NotBlank(message = "Address is required")
    private String address;

    @NotBlank(message = "Date of Birth is required")
    private String dateofBirth;

    @NotBlank(message = "Resigered Date is required")
    private String resigeredDate;

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getEmail() {
	return email;
    }

    public void setEmail(String email) {
	this.email = email;
    }

    public String getAddress() {
	return address;
    }

    public void setAddress(String address) {
	this.address = address;
    }

    public String getDateofBirth() {
	return dateofBirth;
    }

    public void setDateofBirth(String dateofBirth) {
	this.dateofBirth = dateofBirth;
    }

    public String getResigeredDate() {
	return resigeredDate;
    }

    public void setResigeredDate(String resigeredDate) {
	this.resigeredDate = resigeredDate;
    }

}
