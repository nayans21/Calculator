package com.velocity.project;
/**
 * 
 * InvalidInputException is an Exception
 * which occurs whenever the input given by user
 * to the application is not as expected as per requirement.
 *
 * @author Nayan Sawant
 */

public class InvalidInputException extends Exception{
	
	public InvalidInputException(String message) {
		
		super(message);
	}

}
