package com.security.demo.controller;

import com.security.demo.repository.StudentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.security.demo.exception.InvalidDept;
import com.security.demo.exception.InvalidDivision;
import com.security.demo.exception.InvalidEmail;
import com.security.demo.exception.InvalidId;
import com.security.demo.exception.InvalidMobile;
import com.security.demo.exception.InvalidPassword;
import com.security.demo.exception.InvalidRole;
import com.security.demo.exception.InvalidRoll;
import com.security.demo.exception.InvalidUsername;

@RestControllerAdvice
public class GlobleException {

	@ExceptionHandler(InvalidId.class)
	public ResponseEntity<?> invalidid(InvalidId e) {
		return ResponseEntity.status(HttpStatus.UNPROCESSABLE_CONTENT).body(e.getMessage());
	}

	public GlobleException(StudentRepository studentRepository) {
	}

	@ExceptionHandler(InvalidMobile.class)
	public ResponseEntity<?> invalidmobile(InvalidMobile e) {
		return ResponseEntity.status(HttpStatus.UNPROCESSABLE_CONTENT).body(e.getMessage());
	}

	@ExceptionHandler(InvalidEmail.class)
	public ResponseEntity<?> invalidemail(InvalidEmail e) {
		return ResponseEntity.status(HttpStatus.UNPROCESSABLE_CONTENT).body(e.getMessage());
	}

	@ExceptionHandler(InvalidPassword.class)
	public ResponseEntity<?> invalidpassword(InvalidPassword e) {
		return ResponseEntity.status(HttpStatus.UNPROCESSABLE_CONTENT).body(e.getMessage());
	}

	@ExceptionHandler(InvalidUsername.class)
	public ResponseEntity<?> invalidusername(InvalidUsername e) {
		return ResponseEntity.status(HttpStatus.UNPROCESSABLE_CONTENT).body(e.getMessage());
	}

	@ExceptionHandler(InvalidRole.class)
	public ResponseEntity<?> invalidrole(InvalidRole e) {
		return ResponseEntity.status(HttpStatus.UNPROCESSABLE_CONTENT).body(e.getMessage());
	}

	@ExceptionHandler(InvalidRoll.class)
	public ResponseEntity<?> invalidroll(InvalidRoll e) {
		return ResponseEntity.status(HttpStatus.UNPROCESSABLE_CONTENT).body(e.getMessage());

	}

	@ExceptionHandler(InvalidDivision.class)
	public ResponseEntity<?> invaliddivision(InvalidDivision e) {
		return ResponseEntity.status(HttpStatus.UNPROCESSABLE_CONTENT).body(e.getMessage());
	}

	@ExceptionHandler(InvalidDept.class)
	public ResponseEntity<?> invaliddept(InvalidDept e) {
		return ResponseEntity.status(HttpStatus.UNPROCESSABLE_CONTENT).body(e.getMessage());
	}

}
