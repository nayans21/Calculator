package com.velocity.project;
/**
 * Application class is used to perform the operations
 * defined in Calculator class depending on the choice 
 * of the user(choice for which operation to be perform)
 * 
 */
import java.util.Scanner;
import java.io.*;
public class Application {
	private static Scanner scanner;
	private String input1;
	private String input2;
	
	public String getInput1() {
		return input1;
	}

	private void setInput1(String input1) {
		this.input1 = input1;
	}

	public String getInput2() {
		return input2;
	}

	private void setInput2(String input2) {
		this.input2 = input2;
	}
	
	/**
	 * Creates the Scanner class object
	 */

	public static void setScanner() {
		
		scanner = new Scanner(System.in);
	}
	
	/**
	 * printMenuToUser method displays the menu on console
	 * and ask user to choose any one operation.
	 * @return      choice : int value chosen by user 
	 */
	public int printMenuToUser() {
		int choice;
		
		System.out.println("Choose any of the following :\n");
		System.out.println("1. Addition of two numbers");
		System.out.println("2. Substraction of two numbers");
		System.out.println("3. Multiplication of two numbers");
		System.out.println("4. Division of two numbers");
		System.out.println("5. Modulus of two numbers");
		System.out.println("6. Square of a number");
		System.out.println("7. Cube of a number");
		System.out.println("8. Average of numbers");
		System.out.println("9. Factors of numbers");
		System.out.println("10. Find out Even or Odd");
		System.out.print("Enter Your Choice : ");
		choice = scanner.nextInt();
		return choice;
	}
	
	/**
	 * doAddition method calls the addition method of object cal
	 * to perform the addition of input1 and input2
	 * by converting them into numeric data type and
	 * return the output. 
	 * @param cal    Object of class Calculator
	 * @return       String representation of output
	 *               return by cal.addition() method.
	 */
	
	public String doAddition(Calculator cal){
		
		double doubleOutput=0.0;
		long longOutput=0;
		String stringOutput="";
			
		if(this.input1.contains(".") && this.input2.contains(".")) {
			double x = Double.parseDouble(this.input1);
			double y = Double.parseDouble(this.input2);
			doubleOutput = cal.addition(x, y);
			stringOutput = String.valueOf(doubleOutput);
		}
		else if(this.input1.contains(".") && !this.input2.contains(".")) {
			double x = Double.parseDouble(this.input1);
			long y = Long.parseLong(this.input2);
			doubleOutput = cal.addition(x, y);
			stringOutput = String.valueOf(doubleOutput);
		}
		else if (!this.input1.contains(".") && this.input2.contains(".")) {
			long x = Long.parseLong(this.input1);
			double y = Double.parseDouble(this.input2);
			doubleOutput = cal.addition(x, y);
			stringOutput = String.valueOf(doubleOutput);
		}
		else if(!this.input1.contains(".") && !this.input2.contains(".")) {
			long x = Long.parseLong(this.input1);
			long y = Long.parseLong(this.input2);
			longOutput = cal.addition(x, y);
			stringOutput = String.valueOf(longOutput);
		}
		if(stringOutput.contains("."))
			return removeBackZeroes(stringOutput);
		else
			return stringOutput;
	}
	
	/**
	 * doSubtraction method calls the subtraction method of object cal
	 * to perform the addition of input1 and input2
	 * by converting them into numeric data type and
	 * return the output. 
	 * @param cal    Object of class Calculator
	 * @return       String representation of output
	 *               return by cal.subtraction() method.
	 */
	
	public String doSubtraction(Calculator cal){
		
		double doubleOutput=0.0;
		long longOutput=0;
		String stringOutput="";
			
		if(this.input1.contains(".") && this.input2.contains(".")) {
			double x = Double.parseDouble(this.input1);
			double y = Double.parseDouble(this.input2);
			doubleOutput = cal.subtraction(x, y);
			stringOutput = String.valueOf(doubleOutput);
		}
		else if(this.input1.contains(".") && !this.input2.contains(".")) {
			double x = Double.parseDouble(this.input1);
			long y = Long.parseLong(this.input2);
			doubleOutput = cal.subtraction(x, y);
			stringOutput = String.valueOf(doubleOutput);
		}
		else if (!this.input1.contains(".") && this.input2.contains(".")) {
			long x = Long.parseLong(this.input1);
			double y = Double.parseDouble(this.input2);
			doubleOutput = cal.subtraction(x, y);
			stringOutput = String.valueOf(doubleOutput);
		}
		else if(!this.input1.contains(".") && !this.input2.contains(".")) {
			long x = Long.parseLong(this.input1);
			long y = Long.parseLong(this.input2);
			longOutput = cal.subtraction(x, y);
			stringOutput = String.valueOf(longOutput);
		}
		
		if(stringOutput.contains("."))
			return removeBackZeroes(stringOutput);
		else
			return stringOutput;
	}
	
	/**
	 * doMultiplication method calls the multiplication method of object cal
	 * to perform the addition of input1 and input2
	 * by converting them into numeric data type and
	 * return the output. 
	 * @param cal    Object of class Calculator
	 * @return       String representation of output
	 *               return by cal.multiplication() method.
	 */
	
	public String doMultiplication(Calculator cal){
		
		double doubleOutput=0.0;
		long longOutput=0;
		String stringOutput="";
			
		if(this.input1.contains(".") && this.input2.contains(".")) {
			double x = Double.parseDouble(this.input1);
			double y = Double.parseDouble(this.input2);
			doubleOutput = cal.multiplication(x, y);
			stringOutput = String.valueOf(doubleOutput);
		}
		else if(this.input1.contains(".") && !this.input2.contains(".")) {
			double x = Double.parseDouble(this.input1);
			long y = Long.parseLong(this.input2);
			doubleOutput = cal.multiplication(x, y);
			stringOutput = String.valueOf(doubleOutput);
		}
		else if (!this.input1.contains(".") && this.input2.contains(".")) {
			long x = Long.parseLong(this.input1);
			double y = Double.parseDouble(this.input2);
			doubleOutput = cal.multiplication(x, y);
			stringOutput = String.valueOf(doubleOutput);
		}
		else if(!this.input1.contains(".") && !this.input2.contains(".")) {
			long x = Long.parseLong(this.input1);
			long y = Long.parseLong(this.input2);
			longOutput = cal.multiplication(x, y);
			stringOutput = String.valueOf(longOutput);
		}
		
		if(stringOutput.contains("."))
			return removeBackZeroes(stringOutput);
		else
			return stringOutput;
	}
	
	/**
	 * doDivision method calls the division method of object cal
	 * to perform the addition of input1 and input2
	 * by converting them into numeric data type and
	 * return the output. 
	 * @param cal    Object of class Calculator
	 * @return       String representation of output
	 *               return by cal.division() method.
	 */
	
	public String doDivision(Calculator cal){
		
		double doubleOutput=0.0;
		long longOutput=0;
		String stringOutput="";
			
		if(this.input1.contains(".") && this.input2.contains(".")) {
			double x = Double.parseDouble(this.input1);
			double y = Double.parseDouble(this.input2);
			doubleOutput = cal.division(x, y);
			stringOutput = String.valueOf(doubleOutput);
		}
		else if(this.input1.contains(".") && !this.input2.contains(".")) {
			double x = Double.parseDouble(this.input1);
			long y = Long.parseLong(this.input2);
			doubleOutput = cal.division(x, y);
			stringOutput = String.valueOf(doubleOutput);
		}
		else if (!this.input1.contains(".") && this.input2.contains(".")) {
			long x = Long.parseLong(this.input1);
			double y = Double.parseDouble(this.input2);
			doubleOutput = cal.division(x, y);
			stringOutput = String.valueOf(doubleOutput);
		}
		else if(!this.input1.contains(".") && !this.input2.contains(".")) {
			long x = Long.parseLong(this.input1);
			long y = Long.parseLong(this.input2);
			longOutput = cal.division(x, y);
			stringOutput = String.valueOf(longOutput);
		}
		
		if(stringOutput.contains("."))
			return removeBackZeroes(stringOutput);
		else
			return stringOutput;
	}
	
	/**
	 * getModulus method calls the modulus method of object cal
	 * to perform the addition of input1 and input2
	 * by converting them into numeric data type and
	 * return the output. 
	 * @param cal    Object of class Calculator
	 * @return       String representation of output
	 *               return by cal.modulus() method.
	 */
	
	public String getModulus(Calculator cal){
		
		double doubleOutput=0.0;
		long longOutput=0;
		String stringOutput="";
			
		if(this.input1.contains(".") && this.input2.contains(".")) {
			double x = Double.parseDouble(this.input1);
			double y = Double.parseDouble(this.input2);
			doubleOutput = cal.modulus(x, y);
			stringOutput = String.valueOf(doubleOutput);
		}
		else if(this.input1.contains(".") && !this.input2.contains(".")) {
			double x = Double.parseDouble(this.input1);
			long y = Long.parseLong(this.input2);
			doubleOutput = cal.modulus(x, y);
			stringOutput = String.valueOf(doubleOutput);
		}
		else if (!this.input1.contains(".") && this.input2.contains(".")) {
			long x = Long.parseLong(this.input1);
			double y = Double.parseDouble(this.input2);
			doubleOutput = cal.modulus(x, y);
			stringOutput = String.valueOf(doubleOutput);
		}
		else if(!this.input1.contains(".") && !this.input2.contains(".")) {
			long x = Long.parseLong(this.input1);
			long y = Long.parseLong(this.input2);
			longOutput = cal.modulus(x, y);
			stringOutput = String.valueOf(longOutput);
		}
		
		if(stringOutput.contains("."))
			return removeBackZeroes(stringOutput);
		else
			return stringOutput;
	}
	
	/**
	 * getSquare method calls the multiplication method of object cal
	 * once to get the square of input1
	 * by converting it into numeric data type and
	 * return the output. 
	 * @param cal    Object of class Calculator
	 * @return       String representation of output
	 *               return by cal.multiplication() method.
	 */
	
	public String getSquare(Calculator cal) {
		
		double doubleOutput=0.0;
		long longOutput=0;
		String stringOutput="";
	
		if(this.input1.contains(".")) {
			double x = Double.parseDouble(this.input1);
			doubleOutput = cal.multiplication(x, x);
			stringOutput = String.valueOf(doubleOutput);
		}
		
		else if(!this.input1.contains(".")) {
			long x = Long.parseLong(this.input1);
			longOutput = cal.multiplication(x, x);
			stringOutput = String.valueOf(longOutput);
		}
		
		if(stringOutput.contains("."))
			return removeBackZeroes(stringOutput);
		else
			return stringOutput;
	}
	
	/**
	 * getCube method calls the multiplication method of object cal
	 * twice to get the cube of input1
	 * by converting it into numeric data type and
	 * return the output. 
	 * @param cal    Object of class Calculator
	 * @return       String representation of output
	 *               return by cal.multiplication() method.
	 */
	
	public String getCube(Calculator cal) {
		
		double doubleOutput=0.0;
		long longOutput=0;
		String stringOutput="";
	
		if(this.input1.contains(".")) {
			double x = Double.parseDouble(this.input1);
			doubleOutput = cal.multiplication(x, x);
			doubleOutput = cal.multiplication(doubleOutput, x);
			stringOutput = String.valueOf(doubleOutput);
		}
		
		else if(!this.input1.contains(".")) {
			long x = Long.parseLong(this.input1);
			longOutput = cal.multiplication(x, x);
			longOutput = cal.multiplication(longOutput, x);
			stringOutput = String.valueOf(longOutput);
		}
		
		if(stringOutput.contains("."))
			return removeBackZeroes(stringOutput);
		else
			return stringOutput;
	}
	
	/**
	 * findEvenOrOdd method calls the modulus method of object cal
	 * with parameters : input1 and 2
	 * First it converts input1 to numeric data type and
	 * calls the modulus method of cal. 
	 * @param cal    Object of class Calculator
	 * @return       String "Even" : if cal.modulus(input1,2) returns 0.
	 *               String "Odd"  : Otherwise
	 */
	
	public String findEvenOrOdd(Calculator cal) throws InvalidInputException {
		
		long longOutput=0;
		String stringOutput="";
	
		if(this.input1.contains(".")) {
			String expMessage = "Only Integers are Allowed to Check for Even/Odd Number";
			throw new InvalidInputException(expMessage);
		}
		
		else if(!this.input1.contains(".")) {
			long x = Long.parseLong(this.input1);
			longOutput = cal.modulus(x, 2);
			if(longOutput==0)
				stringOutput = "Even";
			else
				stringOutput = "Odd";
		}
		
		return stringOutput;
	}
	
	/**
	 * getFactors method calls the modulus method of object cal
	 * with parameters : input1 and i (i from 1 to input1)
	 * First it converts input1 to numeric data type and
	 * calls the modulus method of cal. 
	 * @param cal    Object of class Calculator
	 * @return       String representation of all the factors
	 */
	
	public String getFactors(Calculator cal) throws InvalidInputException {
		
		
		String stringOutput="";
	
		if(this.input1.contains(".")) {
			String expMessage = "Only Integers are Allowed to get the factors.";
			throw new InvalidInputException(expMessage);
		}
		
		else if(!this.input1.contains(".")) {
			long x = Long.parseLong(this.input1);
			
			for(int i=1;i<=x;i++) {
				if(cal.modulus(x, i)==0) {
					if(i<x)
						stringOutput = stringOutput + i + " , ";
					else
						stringOutput = stringOutput + i;
				}
					
			}
		}
		
		return stringOutput;
	}
	
	/**
	 * getAverage method calls the addition and division methods of object cal
	 *  
	 * @param cal    Object of class Calculator
	 * @return       String representation of output
	 *               
	 */
	
	public String getAverage(Calculator cal) throws InvalidInputException {
		
		String stringOutput="";
		String input="";
		int totalNumbers;
		boolean input2Validation;
		
		System.out.println("How many numbers for calculating Average? : ");
		totalNumbers = scanner.nextInt();
		
		if(totalNumbers<=0) {
			String expMessage = "Enter positive number.";
			throw new InvalidInputException(expMessage);
		}
		if(totalNumbers<2) {
			String expMessage = "Enter at least 2 numbers for calculating Average.";
			throw new InvalidInputException(expMessage);
		}
		
		this.basicArithOperationDetails();
		stringOutput = this.doAddition(cal);
		
		if(totalNumbers > 2) {
			
			for(int i=3;i<=totalNumbers;i++) {
				System.out.print("Enter number "+ i +" : ");
				input = scanner.next();
				input.trim();
				this.setInput1(stringOutput);
				this.setInput2(input);
				
				input2Validation=this.validationDetails(this.input2);
				if(!(input2Validation))
				{
					String expMessage = "Please Enter Valid Input.";
					throw new InvalidInputException(expMessage);
				}
				
				stringOutput = this.doAddition(cal);
			}
		}
		if(stringOutput.contains("."))
			this.setInput1(stringOutput);
		else
			this.setInput1(stringOutput+".00");
		
		this.setInput2(String.valueOf(totalNumbers)+".00");
		
		stringOutput = this.doDivision(cal);
		
		return stringOutput;
	}
	
	/**
	 * getInputDetails method used to get 2 input from user.
	 * Used by all the methods which requires 2 inputs to perform
	 * operation.
	 * These 2 inputs are set as value of method variables input1 and input2.
	 */
	
	public void getInputDetails() {
		
		System.out.print("\nEnter Number 1 : ");
		String input1 = scanner.next();
		System.out.print("Enter Number 2 : ");
		String input2 = scanner.next();
		
		input1.trim();
		input2.trim();
		
		this.setInput1(input1);
		this.setInput2(input2);
		
	}
	
	/**
	 * validationDetails method calls the isValidInput method
	 * of InputValidation class by passing user input as parameter.
	 * And returns the boolean value return by isValidInput method
	 * @param input     input provided by user
	 * @return          Boolean value return by isValidInput method
	 */
	
	public boolean validationDetails(String input) {
		
		return InputValidation.isValidInput(input);
	}
	
	/**
	 * getSingleInputDetails method used to get 1 input from user.
	 * Used by all the methods which requires 1 input to perform
	 * operation.
	 * This 1 input is set as value of method variables input1.
	 */
	
	public void getSingleInputDetails() {
		
		System.out.print("\nEnter Number : ");
		String input1 = scanner.next();
				
		input1.trim();
				
		this.setInput1(input1);
	}
	
	/**
	 * additionalArithOperationDetails get single input by calling getSingleInputDetails
	 * and validates the inputs by calling validationDetails method.
	 * This method is used when operations required 1 input.
	 * 
	 * @throws InvalidInputException    if input is invalid it throws the exception
	 */
	
	public void additionalArithOperationDetails() throws InvalidInputException {
		
		this.getSingleInputDetails();
		boolean input1Validation=this.validationDetails(this.input1);
		if(!(input1Validation))
		{
			String expMessage = "Please Enter Valid Input.";
			throw new InvalidInputException(expMessage);
		}
		
	}
	
	/**
	 * basicArithOperationDetails gets inputs by calling getInputDetails
	 * and validates the inputs by calling validationDetails method.
	 * This method is used when operations required 2 inputs.
	 * 
	 * @throws InvalidInputException    if input is invalid it throws the exception
	 */
	
	public void basicArithOperationDetails() throws InvalidInputException {
		
		this.getInputDetails();
		boolean input1Validation=this.validationDetails(this.input1); 
		boolean input2Validation=this.validationDetails(this.input2);
		if(!(input1Validation && input2Validation))
		{
			String expMessage = "Please Enter Valid Input.";
			throw new InvalidInputException(expMessage);
		}
		
	}
	
	/**
	 * removeBackZeroes is used to remove the extra zeroes 
	 * after decimal point from the output which we got 
	 * from the methods of class Calculator.
	 * 
	 * @param output   String without extra zeroes after decimal point.
	 * @return
	 */
	
	public String removeBackZeroes(String output) {
		
		String temp1 = output.substring(output.indexOf('.')+1);
		String temp2 = output.substring(0,(output.indexOf('.')));
		char [] chArr = temp1.toCharArray();
		int length = temp1.length();
		int i;
		for(i=length-1;i>=0;i--) {
			if(chArr[i]!='0') {
				break;
			}
		}
		String withoutBackZero="";
		for(int j=0;j<=i;j++)
			withoutBackZero= withoutBackZero + chArr[j];
		if(withoutBackZero!="")
			return(temp2+"."+withoutBackZero);
		else
			return(temp2);
	}
	
	/* Calls the required methods depend upon
	 * the operation chosen by user and
	 * prints the output of an operation on console.
	 * 
	 */
	
	public static void main(String[] args) {
		
		int choice;
		Application application = new Application();
		Calculator calculator = new Calculator();
		Application.setScanner();
		String output = "";
		String expMessage="";
		System.out.println("Welcome To Console Based Application\n");
		
			try {
				
				choice = application.printMenuToUser();
				
				switch(choice)
				{
				case 1: application.basicArithOperationDetails();
						output = application.doAddition(calculator);
						System.out.println("Addition is : " + output);
						System.out.println();
						break;
				
				case 2: application.basicArithOperationDetails();
						output = application.doSubtraction(calculator);
						System.out.println("Subtraction is : " + output);
						System.out.println();
						break;
						
				case 3: application.basicArithOperationDetails();
						output = application.doMultiplication(calculator);
						System.out.println("Multiplication is : " + output);
						System.out.println();
						break;
						
				case 4: application.basicArithOperationDetails();
						output = application.doDivision(calculator);
						System.out.println("Division is : " + output);
						System.out.println();
						break;
						
				case 5: application.basicArithOperationDetails();
						output = application.getModulus(calculator);
						System.out.println("Modulus is : " + output);
						System.out.println();
						break;
						
				case 6: application.additionalArithOperationDetails();
						output = application.getSquare(calculator);
						System.out.println("Square is : " + output);
						System.out.println();
						break;
						
				case 7: application.additionalArithOperationDetails();
						output = application.getCube(calculator);
						System.out.println("Cube is : " + output);
						System.out.println();
						break;
						
				case 8: output = application.getAverage(calculator);
						System.out.println("Average is : " + output);
						System.out.println();
						break;
				
				case 9: application.additionalArithOperationDetails();
						output = application.getFactors(calculator);
						System.out.println("Factors are : " + output);
						System.out.println();
						break;
						
						
				case 10: application.additionalArithOperationDetails();
						 output = application.findEvenOrOdd(calculator);
						 System.out.println("Number is : " + output);
						 System.out.println();
						 break;
				
				default: expMessage = "Enter Valid Choice.Choice between 1 to 10";
						 throw new InvalidInputException(expMessage);
				}
				
			}catch(InvalidInputException e) {
				System.out.print(e.getMessage());
			}
			catch(Exception e) {
				String message = "\nPlease give valid input for operations";
				System.out.print(e.getMessage()+message);
			}		
		
	}
}
