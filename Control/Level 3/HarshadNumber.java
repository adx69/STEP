import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        // Initialize the Scanner 
        Scanner sc = new Scanner(System.in);

        // Take inout
        System.out.print("Enter a Number: ");
        int number = sc.nextInt();

        // Store the og number 
        int originalNumber = number;

        // Initialize a variable
        int sum = 0;

        // Loop until the number becomes 0
        while (number != 0) {
            // Get the last digit of the number
            int digit = number % 10;

            // Add the digit to the sum
            sum += digit;

            // Remove the last digit by integer division
            number /= 10;
        }

        // Check if the original number is divisible by the sum of its digits
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number");
        } else {
            System.out.println(originalNumber + " is Not a Harshad Number");
        }

        sc.close();
    }
}
