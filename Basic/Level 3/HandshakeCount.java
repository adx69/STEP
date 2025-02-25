import java.util.Scanner;

public class HandshakeCount {
	public static void main(String[] args) {
		// Initialize the Scanner object to read user input
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter the number of students
		System.out.print("Enter the number of students: ");
		int numberOfStudents = input.nextInt();

		// Calculate the possible number of handshakes using the formula: n(n-1)/2
		int PossibleHandshake = (numberOfStudents * (numberOfStudents - 1)) / 2;

		// Display the result
		System.out.println("The possible number of handshakes are " + PossibleHandshake);

		// Close the scanner to avoid resource leaks
		input.close();
	}
}