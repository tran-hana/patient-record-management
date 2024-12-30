
/*File name: MyHealthDataBase.java
 * Author: Ha Nhu Y Tran, 041165059
 * Course: CST8284 – OOP
 * Assignment: Assignment 1
 * Date: Oct 10, 2024
 * Professor: Gustavo Adami
 * Purpose: The MyHealthDataBase class serves as a base class for to calculate Body Mass Index (BMI), that can be inherited by sub classes.
 * Class list: MyHealthData, MyHealthDataBase, MyHealthDataTest, MyHealthDataTest2
 * 
 */

package Assignment1;

/**
 * MyHealthDataBase is a base class to be extended for the Electronic Health Records (EHR) System,
 * also known as Assignment 1.  It contains a method to calculate BMI and will contain other methods.
 * @author Ha Nhu Y Tran
 * @version 1.01
 * @since Java 17.0.11
 * @see MyHealthData
 */

public class MyHealthDataBase
{
	/** 
	 * This method returns the calculated Body Mass Index (BMI) from data provided.
	 * @param weightParam Weight of the patient in pounds.
	 * @param heightParam Height of the patient in inches.
	 * @return the double value of BMI
	 */
	public double calculateBMI(double weightParam, double heightParam)
	{
		return weightParam * 703 / (heightParam * heightParam);
	}


	/** 
	 * This method returns the incorrectly calculated Body Mass Index (BMI) from data provided for testing purpose.
	 * In this method, the formula to calculate BMI was changed to cause an intentional error
	 * Incorrect method introduce an error in the math: BMI = weight*703/(height*height*height)
	 * @param weightParam Weight of the patient in pounds.
	 * @param heightParam Height of the patient in inches.
	 * @return the double value of incorrect BMI value
	 */
	public double incorrectBMI(double weightParam, double heightParam)
	{
		return weightParam * 703 / (heightParam * heightParam * heightParam);
	}
}