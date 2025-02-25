import java.util.Scanner;

class SwapTwoNumbers {
	public static void main(String[] args) {
		// Declare variables to hold the numbers and a temporary variable for swapping
		int number1;
		int number2;
		int temp;

		// Initialize the Scanner object to read user input
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter the first number
		System.out.print("Enter the first Number: ");
		number1 = input.nextInt();

		// Prompt the user to enter the second number
		System.out.print("Enter the second Number: ");
		number2 = input.nextInt();

		// Swap the values of number1 and number2 using the temporary variable
		temp = number1;
		number1 = number2;
		number2 = temp;

		// Display the swapped numbers
		System.out.print("The swapped numbers are " + number1 + " and " + number2);

		// Close the scanner to avoid resource leaks
		input.close();
	}
}