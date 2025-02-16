import java.util.Scanner;

class Q6_QuotientRemainder {
    public static void main(String[] args) {
        // Initialize the Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter first number: ");
        int number1 = scanner.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter second number: ");
        int number2 = scanner.nextInt();

        // Calculate the quotient of the division
        int quotient = number1 / number2;

        // Calculate the remainder of the division
        int remainder = number1 % number2;

        // Display the result
        System.out.println("The quotient is " + quotient + " and remainder is " + remainder + " of two numbers "
                + number1 + " and " + number2);

        scanner.close();
    }
}
