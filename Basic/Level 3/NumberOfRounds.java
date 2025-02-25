import java.util.Scanner;

class NumberOfRounds {
	public static void main(String[] args) {
		// Initialize the Scanner object to read user input
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter the length of side1 in meters
		System.out.println("Enter side1 in m");
		int side1 = input.nextInt();

		// Prompt the user to enter the length of side2 in meters
		System.out.println("Enter side2 in m");
		int side2 = input.nextInt();

		// Prompt the user to enter the length of side3 in meters
		System.out.println("Enter side3 in m");
		int side3 = input.nextInt();

		// Calculate the perimeter of the triangle
		int perimeter = side1 + side2 + side3;

		// Calculate the number of rounds the athlete needs to run to complete 5 km
		int NoOfRounds = 5000 / perimeter;

		// Display the total number of rounds the athlete will run
		System.out.println("The total number of rounds the athlete will run is " + NoOfRounds + " to complete 5 km");

		// Close the scanner to avoid resource leaks
		input.close();
	}
}