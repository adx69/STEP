import java.util.Scanner;

class AbundantNumber {
    public static void main(String[] args) {
        // Initialize the Scanner
        Scanner input = new Scanner(System.in);

        // user enter a number
        System.out.print("Enter Number: ");
        int number = input.nextInt();

        // Initialize a variable to store the sum of proper divisors
        int sum = 0;

        // Loop all numbers from 1 to (number - 1)
        for (int i = 1; i < number; i++) {
            // Check if 'i' is a proper divisor of 'number'
            if (number % i == 0) {
                // Add the proper divisor to the sum
                sum += i;
            }
        }

        // Check if the sum of proper divisors is greater than the number
        if (sum > number) {
            // If true, the number is an abundant number
            System.out.println(number + " is an Abundant Number");
        } else {
            // If false, the number is not an abundant number
            System.out.println(number + " is not an Abundant Number");
        }

        input.close();
    }
}