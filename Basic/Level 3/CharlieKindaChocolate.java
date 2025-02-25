import java.util.Scanner;

class CharlieKindaChocolate {
	public static void main(String[] args) {
		// Initialize the Scanner object to read user input
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter the number of chocolates and number of children
		System.out.println("Enter number of chocolates and number of children");
		int numberOfChocolates = input.nextInt();
		int numberOfChildren = input.nextInt();

		// Calculate the number of chocolates each child gets
		int chocolatesPerPerson = numberOfChocolates / numberOfChildren;

		// Calculate the number of remaining chocolates
		int chocolatesLeft = numberOfChocolates % numberOfChildren;

		// Display the number of chocolates each child gets and the number of remaining
		// chocolates
		System.out.println("The number of chocolates each child gets is " + chocolatesPerPerson
				+ " and the number of remaining chocolates are " + chocolatesLeft);

		// Close the scanner to avoid resource leaks
		input.close();
	}
}
