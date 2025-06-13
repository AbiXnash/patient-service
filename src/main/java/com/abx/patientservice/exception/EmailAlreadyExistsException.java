package com.abx.patientservice.exception;

public class EmailAlreadyExistsException extends RuntimeException {

    private static final long serialVersionUID = -2718290661526757675L;

    public EmailAlreadyExistsException(String message) {
	super(message);
    }
}
