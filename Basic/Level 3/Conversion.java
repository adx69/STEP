import java.util.Scanner;

class Conversion {
	public static void main(String[] args) {
		// Initialize the Scanner object to read user input
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter the weight in pounds
		System.out.println("Enter weight in pounds");
		double weightInPounds = input.nextDouble();

		// Convert the weight from pounds to kilograms (1 pound = 2.2 kg)
		double weightInKg = weightInPounds * 2.2;

		// Display the weight in both pounds and kilograms
		System.out.println("The weight of the person in pounds is " + weightInPounds + " and in kg is " + weightInKg);

		// Close the scanner to avoid resource leaks
		input.close();
	}
}