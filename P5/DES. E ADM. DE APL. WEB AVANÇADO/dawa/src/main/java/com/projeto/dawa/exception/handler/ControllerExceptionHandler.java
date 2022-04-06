package com.projeto.dawa.exception.handler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.projeto.dawa.exception.MessageErrorException;
import com.projeto.dawa.exception.ResourceNotFoundException;

@ControllerAdvice
public class ControllerExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<MessageErrorException> resourceNotFoundException(ResourceNotFoundException ex, WebRequest req) {
		MessageErrorException message = new MessageErrorException(
			HttpStatus.NOT_FOUND.value(),
			new Date(),
			ex.getMessage(),
			req.getDescription(false)
		);
		
		return new ResponseEntity<MessageErrorException>(message, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<MessageErrorException> globalExceptionHandler(Exception ex, WebRequest req) {
		MessageErrorException message = new MessageErrorException (
			HttpStatus.INTERNAL_SERVER_ERROR.value(),
			new Date(),
			ex.getMessage(),
			req.getDescription(false)
		);
		return new ResponseEntity<MessageErrorException>(message, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
