import java.util.Scanner;

class unSimpleInterest {
	public static void main(String[] args) {

		// Initialize the Scanner object to read user input
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter the principal amount
		System.out.println("Enter principal amount");
		double principal = input.nextDouble();

		// Prompt the user to enter the rate of interest
		System.out.println("Enter rate of interest");
		double rate = input.nextDouble();

		// Prompt the user to enter the time period in days
		System.out.println("Enter the time period in days");
		double time = input.nextDouble() * 24; // Convert days to hours

		// Calculate the simple interest using the formula: (principal * rate * time) /
		// 100
		double SimpleInterest = (principal * rate * time) / 100;

		// Display the calculated simple interest along with the principal, rate, and
		// time
		System.out.println("The Simple Interest is " + SimpleInterest + " for Principal " + principal
				+ ", Rate of Interest " + rate + " and Time " + time);

		// Close the scanner to avoid resource leaks
		input.close();
	}
}