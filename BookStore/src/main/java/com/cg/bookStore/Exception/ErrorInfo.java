package com.cg.bookStore.Exception;

public class ErrorInfo {
	private String message;
	public ErrorInfo(){}
	public ErrorInfo(String message) {
		super();
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
