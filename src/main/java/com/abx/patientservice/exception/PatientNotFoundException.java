package com.abx.patientservice.exception;

public class PatientNotFoundException extends RuntimeException {
    private static final long serialVersionUID = -6270518060139390336L;

    public PatientNotFoundException(String message) {
	super(message);
    }
}
