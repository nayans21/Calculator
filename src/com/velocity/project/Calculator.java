package com.velocity.project;

/**
 * Calculator class contains methods which performs
 * Basic Arithmetic Operations like 
 * Addition,Subtraction,Multiplication,Division and Modulus.
 * For each operation Method Overloading is used as the parameters
 * for the same operation can be different.
 * 
 * @author Nayan Sawant
 *
 */

public class Calculator {

	/**
	 * Method for addition of 2 numbers
	 * 
	 * @param x   can be of type long or double
	 * @param y   can be of type long or double
	 * @return    addition of x and y.
	 *            Return type depend upon data type of x and y 
	 */
	
	public long addition(long x,long y) {
		return x+y;
	}
	
	public double addition(double x, double y) {
		return x+y;
	}
	
	public double addition(long x, double y) {
		return x+y;
	}
	
	public double addition(double x, long y) {
		return x+y;
	}
	
	/**
	 * Method for subtraction of 2 numbers
	 * 
	 * @param x   can be of type long or double
	 * @param y   can be of type long or double
	 * @return    subtraction of x and y.
	 *            Return type depend upon data type of x and y 
	 */
	
	public long subtraction(long x,long y) {
		return x-y;
	}
	
	public double subtraction(double x, double y) {
		return x-y;
	}
	
	public double subtraction(long x, double y) {
		return x-y;
	}
	
	public double subtraction(double x, long y) {
		return x-y;
	}
	
	/**
	 * Method for multiplication of 2 numbers
	 * 
	 * @param x   can be of type long or double
	 * @param y   can be of type long or double
	 * @return    multiplication of x and y.
	 *            Return type depend upon data type of x and y 
	 */
	
	public long multiplication(long x,long y) {
		return x*y;
	}
	
	public double multiplication(double x, double y) {
		return x*y;
	}
	
	public double multiplication(long x, double y) {
		return x*y;
	}
	
	public double multiplication(double x, long y) {
		return x*y;
	}
	
	/**
	 * Method for division of 2 numbers
	 * 
	 * @param x   can be of type long or double
	 * @param y   can be of type long or double
	 * @return    division of x and y.
	 *            Return type depend upon data type of x and y 
	 */
	
	public long division(long x,long y) {
		return x/y;
	}
	
	public double division(double x, double y) {
		return x/y;
	}
	
	public double division(long x, double y) {
		return x/y;
	}
	
	public double division(double x, long y) {
		return x/y;
	}
	
	/**
	 * Method for modulus of 2 numbers
	 * 
	 * @param x   can be of type long or double
	 * @param y   can be of type long or double
	 * @return    modulus of x and y.
	 *            Return type depend upon data type of x and y 
	 */
	
	public long modulus(long x,long y) {
		return x%y;
	}
	
	public double modulus(double x, double y) {
		return x%y;
	}
	
	public double modulus(long x, double y) {
		return x%y;
	}
	
	public double modulus(double x, long y) {
		return x%y;
	}
}
