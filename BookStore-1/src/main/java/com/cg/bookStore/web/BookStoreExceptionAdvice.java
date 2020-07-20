package com.cg.bookStore.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.cg.bookStore.exceptions.BookException;
import com.cg.bookStore.exceptions.CategoryException;

@RestControllerAdvice
public class BookStoreExceptionAdvice {
		
		@ExceptionHandler(value= {CategoryException.class, BookException.class})
		@ResponseStatus(code=HttpStatus.BAD_REQUEST)
		public Map<String,String> handleException(Exception ex) {
			Map<String, String> map = new HashMap<>();
			map.put("message", ex.getMessage());
			return map;
		}
}
