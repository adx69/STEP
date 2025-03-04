import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        // Get input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Initialize sum
        int sum = 0;

        // copy the original number to compare later
        int originalNumber = number;

        // Loop until the original number becomes 0
        while (originalNumber != 0) {
            // Get the remainder for last digit
            int remainder = originalNumber % 10;

            // Cube the remainder and add it to sum
            sum += remainder * remainder * remainder;

            // Remove the last digit by integer division
            originalNumber = originalNumber / 10;
        }

        // Check if the sum of cubes of digits is equal to the original number
        if (sum == number) {
            // If true, the number is an Armstrong number
            System.out.println(number + " is an Armstrong number");
        } else {
            // If false, the number is not an Armstrong number
            System.out.println(number + " is not an Armstrong number");
        }

        // Close the scanner to avoid resource leaks
        sc.close();
    }
}