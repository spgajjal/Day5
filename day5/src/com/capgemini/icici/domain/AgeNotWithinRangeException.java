package com.capgemini.icici.domain;

public class AgeNotWithinRangeException extends Exception {
	public AgeNotWithinRangeException(String message)
	{
		super(message);
	}

}
