package com.abx.patientservice.exception;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExcpetionHandler {

    private static final Logger log = org.slf4j.LoggerFactory.getLogger(GlobalExcpetionHandler.class);

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, String>> handleValidation(MethodArgumentNotValidException e) {
	Map<String, String> errors = new HashMap<>();
	e.getBindingResult().getFieldErrors().forEach(error -> errors.put(error.getField(), error.getDefaultMessage()));

	return ResponseEntity.badRequest().body(errors);
    }

    @ExceptionHandler(EmailAlreadyExistsException.class)
    public ResponseEntity<Map<String, String>> handleEmailAlreadyExistsException(EmailAlreadyExistsException e) {
	Map<String, String> errors = new HashMap<>();
	log.warn("Email already exists: {}", e.getMessage());
	errors.put("message", "Email already exists!!");

	return ResponseEntity.badRequest().body(errors);
    }

    @ExceptionHandler(PatientNotFoundException.class)
    public ResponseEntity<Map<String, String>> handlePatientNotFoundException(PatientNotFoundException e) {
	Map<String, String> errors = new HashMap<>();
	log.warn("Patient not found with ID: {}", e.getMessage());
	errors.put("message", "Patient not found!!");

	return ResponseEntity.badRequest().body(errors);
    }

}
