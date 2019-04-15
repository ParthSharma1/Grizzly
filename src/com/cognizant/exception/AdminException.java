package com.cognizant.exception;

public class AdminException extends RuntimeException {
	String message;

	public AdminException(String message) {
		// TODO Auto-generated constructor stub
		this.message=message;
	}

}
