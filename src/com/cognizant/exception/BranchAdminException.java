package com.cognizant.exception;

public class BranchAdminException extends RuntimeException{

	String message;
	public BranchAdminException(String message) {
		// TODO Auto-generated constructor stub
		this.message=message;
		System.out.println(message);
	}

}
