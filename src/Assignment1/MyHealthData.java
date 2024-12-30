/*File name: MyHealthData.java
 * Author: Ha Nhu Y Tran, 041165059
 * Course: CST8284 – OOP
 * Assignment: Assignment 1
 * Date: Oct 10, 2024
 * Professor: Gustavo Adami
 * Purpose: The MyHealthData class represent  health profile of a patient. This contains patient information
 * such as name, gender, height, weight, and birth year and methods to calculate health metrics age, BMI, maximum heart rate, 
 * and target heart rate range.
 * Class list: MyHealthData, MyHealthDataBase, MyHealthDataTest, MyHealthDataTest2
 */

package Assignment1;

/**
 * This class is named MyHealthData which extends MyHealthDataBase that includes method to calculate the Body Max Index (BMI).
 * This class contains important health information about a patient (first and last name, gender, birth year, height, and weight)
 * and demonstrates methods to calculate health metrics and display all patient's health data.
 * @see Assignment1
 * @author Ha Nhu Y Tran
 * @version 1.01
 * @since 17.0.11
 */

public class MyHealthData extends MyHealthDataBase {

	/** 
	 * This is first name component of patient
	 */
	private String firstName;

	/** 
	 * This is last name component of patient
	 */
	private String lastName;

	/** 
	 * This is gender component of patient
	 */
	private String gender;

	/** 
	 * This is birth year component of patient
	 */
	private int birthYear;

	/** 
	 * This is current year component 
	 */
	private int currentYear;

	/** 
	 * This is height component of patient
	 */
	private double height;

	/** 
	 * This is weight component of patient
	 */
	private double weight;


	/**
	 * This constructor sets patient's first name, last name, gender, height, weight, birth year, current year as passed
	 * @param firstName The patient's first name.
	 * @param lastName The patient's last name.
	 * @param gender The patient's gender.
	 * @param birthYear The patient's birth year.
	 * @param height The patient's height in inches.
	 * @param weight The patient's weight in pounds.
	 * @param currentYear The current year.
	 */
	public MyHealthData (String firstName, String lastName, String gender, double height, double weight, int birthYear, int currentYear){
		this.firstName = firstName;   
		this.lastName = lastName;    	
		this.gender = gender;
		this.height = height;
		this.weight = weight;
		this.birthYear = birthYear;
		this.currentYear = currentYear;
	}

	/**
	 * Return the first name of the patient
	 * @return the first name of the patient
	 */
	public String getFirstName () {
		return firstName;
	}

	/**
	 * Sets the first name of the patient
	 * @param firstName The first name of patient.
	 */
	public void setFirstName (String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Return the last name of the patient.
	 * @return the last name of the patient.
	 */
	public String getLastName( ) {
		return lastName;
	}

	/**
	 * Set the last name of the patient
	 * @param lastName the last name of the patient.
	 */
	public void setLastName (String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Return gender of the patient
	 * @return gender of the patient
	 */
	public String getGender () {
		return gender;
	}

	/**
	 * Set the gender of the patient
	 * @param gender of the patient
	 */
	public void setGender (String gender) {
		this.gender = gender;
	}

	/** 
	 * Return the height of the patient
	 * @return the height of the patient
	 */
	public double getHeight () {
		return height;
	}
	
	/**
	 * Set the height of the patient
	 * @param height this is the height of the patient
	 */
	public void setHeight (int height) {
		this.height = height;
	}

	/**
	 * Return the weight of the patient
	 * @return the weight of the patient
	 */
	public double getWeight () {
		return weight;
	}
	
	/**
	 * Set weight of the patient 	
	 * @param weight this is the weight of the patient
	 */
	public void setWeight (double weight) {
		this.weight = weight;
	}

	/**
	 * Return birth year of patient
	 * @return birthYear of patient
	 */
	public int getBirthYear () {
		return birthYear;
	}

	/**
	 * Set birth year of the patient.
	 * @param birthYear this is birth year of the patient.
	 */
	public void setBirthYear (int birthYear) {
		this.birthYear = birthYear;
	}

	/**
	 * Return current year, it will be unchanged once set.
	 * @return currentYear.
	 */
	public int getCurrentYear () {
		return currentYear;
	}

	/**
	 * Return the integer value of the age of the patient
	 * @return an integer value of the age of the patient
	 */
	public int getAge () {
		return currentYear - birthYear;
	}

	/** This is the method to calculate Maximum Heart Rate as 220 – Age in years
	 * @return an integer value of the Maximum Heart Rate
	 */
	public int calculateMaximumHeartRate () {
		return 220 - getAge();
	}

	/**
	 * This is the method to calculate the Minimum Target Heart Rate.
	 * MinimumTargetHeartRate is 50% of MaximumHeartRate.
	 * @return a double value of Minimum Target Heart Rate.
	 */
	public  double calculateMinimumTargetHeartRate () {
		return 0.50 * calculateMaximumHeartRate ();	   
	}

	/**
	 * This is the method to calculate the Maximum Target Heart Rate.
	 * MaximumTargetHeartRate is 85% of MaximumHeartRate
	 * @return a double value of Maximum Target Heart Rate
	 */
	public double calculateMaximumTargetHeartRate () {
		return 0.85 * calculateMaximumHeartRate ();  	   
	}

	/**
	 * This is the method to output formattedString representation of all health data of the patient regarding   
	 * first name, last name, gender, year of birth, age in years, height (inches), weight (pounds),
	 * Body Mass Index (BMI), Maximum heart rate, Target heart rate range ( Minimum Target Heart Rate and Maximum Target Heart rate)
	 */
	public void displayMyHealthData() 
	{ 
		System.out.printf("First Name: %s \n", firstName);
		System.out.printf("Last Name: %s \n", lastName);
		System.out.printf("Gender: %s \n", gender);
		System.out.printf("Year of Birth: %d\n", birthYear);
		System.out.printf("Age in years: %d \n", getAge());
		System.out.printf("Height (in): %.2f \n", height);
		System.out.printf("Weight (lbs): %.2f \n", weight);
		System.out.printf("BMI: %.2f \n", calculateBMI(weight,height));
		System.out.printf ("Maximum heart rate: %d \n", calculateMaximumHeartRate ());
		System.out.printf ("Target heart rate range: %.2f and %.2f\n", calculateMinimumTargetHeartRate (), calculateMaximumTargetHeartRate ());

		System.out.println("BMI VALUES");
		System.out.println("Underweight: less than 18.5");
		System.out.println("Normal:      between 18.5 and 24.9");
		System.out.println("Overweight:  between 25 and 29.9");
		System.out.println("Obese:       30 or greater");   
	} 

} // end class MyHealthData