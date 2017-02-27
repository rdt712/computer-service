package com.toler.dtlp.computer.controller;

import java.util.Collections;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.toler.dtlp.computer.exception.NoComputerException;

@RestControllerAdvice
public class ExceptionController {
	
	@ExceptionHandler(NoComputerException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public Map<String, String> missingMovie(NoComputerException e) {
		return Collections.singletonMap("error", "computer " + e.getComputerId() + " not found.");
	}
}
