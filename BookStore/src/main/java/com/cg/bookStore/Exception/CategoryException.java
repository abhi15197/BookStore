package com.cg.bookStore.Exception;

public class CategoryException extends Throwable {

	private static final long serialVersionUID = 7120812304308536789L;
	String message;
	
	public CategoryException(String msg) {
		this.message=msg;
	}
	   
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
