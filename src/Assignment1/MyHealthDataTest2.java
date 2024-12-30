/*File name: MyHealthDataTest2.java
 * Author: Ha Nhu Y Tran, 041165059
 * Course: CST8284 – OOP
 * Assignment: Assignment 1
 * Date: Oct 10, 2024
 * Professor: Gustavo Adami
 * Purpose:  The MyHealthDataTest2 class performs unit tests on the methods of MyHealthDataBase to
 * to verify the accuracy of the calculateBMI() method and intentional errors in the incorrectBMI()method. 
 * Class list: MyHealthData, MyHealthDataBase, MyHealthDataTest, MyHealthDataTest2
 */
package Assignment1;

import org.junit.Assert;
import org.junit.Test;

/**This class is to test the calculateBMI method and incorrectBMI method in MyHealthDataBase
 * to ensure the accuracy of BMI calculation and identify the error of incorrect BMI calculation. 
 * @see Assignment1
 * @see org.junit.Assert
 * @see org.junit.Test
 * @author Ha Nhu Y Tran
 * @version 1.01
 * @since 17.0.11
 */
public class MyHealthDataTest2 {

	/** This value EPSILON is used to manage floating-point precision errors in calculation
	 *
	 */
	private static final double EPSILON = 1E-12;

	/**
	 * Tests the calculateBMI method with normal weight and height values to verify the accuracy of the method to calculate BMI
	 * This test uses assertEquals with the value EPSILON which handle the floating-point precision errors to verify the output.
	 */
	@Test
	public void testCalculateBMICorrectValues() {
		double weight = 150; // pounds
		double height = 65;  // inches
		MyHealthData patientHealthData = new MyHealthData("Paul", "Alexander", "Male", height, weight, 1985, 2024);
		double expectedBMI = weight*703/(height*height) ; 
		double bmi = patientHealthData.calculateBMI(weight, height);
		Assert.assertEquals(expectedBMI, bmi, EPSILON);
	}

	/**
	 * Tests the incorrectBMI method with normal weight and height values.
	 * In this method, the formula to calculate BMI was changed to cause an intentional error
	 * Incorrect method introduce an error in the math: BMI = weight*703/(height*height*height)
	 */
	@Test
	public void testIncorrectBMICalculation() {
		double weight = 115; // pounds
		double height = 58;  // inches

		MyHealthData patientHealthData = new MyHealthData("Paul", "Alexander", "Male", height, weight, 1985, 2024);
		double expectedBMI = weight*703/(height* height); // Correctly calculated BMI based on the correct formula for these inputs
		double bmi = patientHealthData.incorrectBMI(weight, height);// BMI = weight*703/(height*height*height)

		// This assertion should pass when using assertNotEquals method with EPSILON value that handle the floating-point precision errors .
		Assert.assertNotEquals(expectedBMI, bmi, EPSILON);
	}	

}
