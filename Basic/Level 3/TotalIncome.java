import java.util.Scanner;

class TotalIncome {
	public static void main(String[] args) {
		// Initialize the Scanner object to read user input
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter the salary
		System.out.print("Enter Salary: ");
		double salary = input.nextInt();

		// Prompt the user to enter the bonus
		System.out.println("Enter bonus: ");
		double bonus = input.nextInt();

		// Calculate the total income by adding salary and bonus
		double TotalIncome = salary + bonus;

		// Display the salary, bonus, and total income
		System.out.print("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR "
				+ TotalIncome);

		// Close the scanner to avoid resource leaks
		input.close();
	}
}