package com.velocity.project;
/**
 * InputValidation class is used to check that
 * if the input provided by user is valid or not.
 * 
 * @author Nayan Sawant
 *
 */
public final class InputValidation {
	/**
	 * cannot instantiate object of this class
	 */
	private InputValidation() {}
	
	/**
	 * check that if @param is as per expectation
	 * @param input   String type value. Basically an Input.
	 * @return        true  : If input is valid
	 *                false : If input is not valid
	 */
	
	public static boolean isValidInput(String input)
	{
		if(input.isEmpty())
			return false;
		
		if(input.contains(".")) {
			if((input.indexOf(".")) != (input.lastIndexOf(".")))
				return false;
			}
		
		if(input.contains("-")) {
			if((input.indexOf("-")) != (input.lastIndexOf("-")))
				return false;
			if(!input.startsWith("-"))
				return false;
	   }
	
	   if(input.contains("+")) {
		   if((input.indexOf("+")) != (input.lastIndexOf("+")))
			   return false;
			if(!input.startsWith("+"))
				return false;
	   }
	   
	   char [] charString = input.toCharArray();
	   
	   int length = input.length();
	   
	   for(int i=0;i<length;i++) {
		   if(!Character.isDigit(charString[i])) {
			   char ch = charString[i];
			   if(!(ch=='.' || ch=='+' || ch=='-'))
				   return false;
		   }
	   }
	   
	   return true;
	}
}
