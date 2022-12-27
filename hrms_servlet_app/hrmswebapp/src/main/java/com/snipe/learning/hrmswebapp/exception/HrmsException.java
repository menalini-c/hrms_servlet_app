package com.snipe.learning.hrmswebapp.exception;

public class HrmsException extends Exception{
	
	private static final long serialVersionUID = 1L;
	private String errorCode;
	
	public HrmsException() {
		super();
	}
	
	public HrmsException(String errorCode) {
		super(errorCode);
		this.errorCode = errorCode;
	}
	
	public HrmsException(String message, String errorCode) {
		super(message);
		this.errorCode = errorCode;
	}
	
	public HrmsException(Throwable cause, String errorCode) {
		super(cause);
		this.errorCode = errorCode;
	}
	
	public HrmsException(String message, Throwable cause, String errorCode) {
		super(message, cause);
		this.errorCode = errorCode;
	}

	public String getErrorCode() {
		return errorCode;
	}
}
