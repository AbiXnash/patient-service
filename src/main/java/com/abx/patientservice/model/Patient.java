package com.abx.patientservice.model;

import java.time.LocalDate;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @NotNull
    private String name;

    @NotNull
    @Email
    @Column(unique = true)
    private String email;

    @NotNull
    @Size(min = 10, max = 10, message = "Phone number must be exactly 10 digits")
    @Digits(integer = 10, fraction = 0, message = "Phone number must contain only digits")
    @Column(unique = true)
    private Integer phoneNumber;

    @NotNull
    private String address;

    @NotNull
    private LocalDate dateOfBirth;

    @NotNull
    private LocalDate registedDate;

    public UUID getId() {
	return id;
    }

    public void setId(UUID id) {
	this.id = id;
    }

    public @NotNull String getName() {
	return name;
    }

    public void setName(@NotNull String name) {
	this.name = name;
    }

    public @NotNull @Email String getEmail() {
	return email;
    }

    public void setEmail(@NotNull @Email String email) {
	this.email = email;
    }

    public Integer getPhoneNumber() {
	return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
	this.phoneNumber = phoneNumber;
    }

    public @NotNull String getAddress() {
	return address;
    }

    public void setAddress(@NotNull String address) {
	this.address = address;
    }

    public @NotNull LocalDate getDateOfBirth() {
	return dateOfBirth;
    }

    public void setDateOfBirth(@NotNull LocalDate dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
    }

    public @NotNull LocalDate getRegistedDate() {
	return registedDate;
    }

    public void setRegistedDate(@NotNull LocalDate registedDate) {
	this.registedDate = registedDate;
    }
}
