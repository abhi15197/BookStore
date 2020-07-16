package com.cg.bookStore.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.cg.bookStore.Exception.CategoryException;
import com.cg.bookStore.Exception.ErrorInfo;
/*
 * AccountAdvice is the class to take the badrequest processed to the frontend
 * so errors can be seen on screen
 * 
 */
@RestControllerAdvice
public class CategoryAdvice {

	//this annotation here captures the request from the custom exception class
	@ExceptionHandler(value= {CategoryException.class})
	
	//this annotation responds for any bad request 
	@ResponseStatus(code=HttpStatus.BAD_REQUEST)
	
	/*
	 * function for handling the exceptions and passing to the frontend
	 */
	public ErrorInfo  handelException(CategoryException ex) {
		return new ErrorInfo(ex.getMessage());
	}
}