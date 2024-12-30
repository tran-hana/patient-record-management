/*File name: MyHealthDataTest.java
 * Author: Ha Nhu Y Tran, 041165059
 * Course: CST8284 – OOP
 * Assignment: Assignment 1
 * Date: Oct 10, 2024
 * Professor: Gustavo Adami
 * Purpose: The MyHealthDataTest class serves as a driver class to test the functionality of the MyHealthData class.
 * The program prompts user to input patient information, instantiate an object of MyHealthData class that held the date,
 * and output the patient’s health information along with other calculated metrics such as BMI, maximum heart rate and target heart rates.
 * Class list: MyHealthData, MyHealthDataBase, MyHealthDataTest, MyHealthDataTest2
 */

package Assignment1;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * MyHealthDataTest class is used to test the functionality of the MyHealthData class.
 * It prompts user to input patient information, instantiate an object of MyHealthData, 
 * and displays the patient's information and their health metrics.
 * @see Assignment1
 * @see java.time.LocalDate
 * @see java.util.Scanner
 * @author Ha Nhu Y Tran
 * @version 1.01
 * @since 17.0.11
 * 
 */
public class MyHealthDataTest {

	/**
	 * This is the main method to run the program.
	 * @param args Command-line arguments (not used).
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt user to enter patient's first name
		System.out.print("Please enter patient's first name: ");
		String firstName = input.nextLine();

		// Prompt user to enter patient's last name
		System.out.print("Please enter patient's last name: ");
		String lastName = input.nextLine();

		// Prompt user to enter patient's gender
		System.out.print("Please enter patient's gender: ");
		String gender = input.nextLine();

		// Prompt user to enter patient's birth year
		System.out.print("Please enter patient's year of birth: ");
		int birthYear = input.nextInt();

		// Prompt user to enter patient's height in inches
		System.out.print("Please enter patient's height (inches): ");
		double height = input.nextDouble();

		// Prompt user to enter patient's weight in pounds
		System.out.print("Please enter patient's weight (pounds): ");
		double weight = input.nextDouble();

		int currentYear= LocalDate.now().getYear();

		// Instantiate an object of MyHealthData class
		MyHealthData healthData = new MyHealthData(firstName, lastName, gender, height, weight, birthYear,currentYear);

		// Display all health data of the patient
		healthData.displayMyHealthData();

		System.out.println ("Program by Ha Nhu Y Tran");

		input.close();
	}
}
