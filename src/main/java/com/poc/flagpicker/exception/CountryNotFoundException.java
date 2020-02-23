package com.poc.flagpicker.exception;

public class CountryNotFoundException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String msg;

	public CountryNotFoundException(String msg) {
		super();
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "CountryNotFoundException [msg=" + msg + "]";
	}
	
	
	
	

}
