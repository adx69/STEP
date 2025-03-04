import java.util.Scanner;

class PrimeNumber {
    public static void main(String[] args) {
        // Initialize the Scanner
        Scanner input = new Scanner(System.in);

        // take input
        System.out.print("Enter Number: ");
        int number = input.nextInt();

        // Initialize a boolean variable 
        boolean isPrime = true;

        // Check if the number is less than or equal to 1
        if (number <= 1) {
            isPrime = false;
        } else {
            // Loop from 2 to half of the number to check for factors
            for (int i = 2; i <= number / 2; i++) {
                // If the number is divisible by any number other than 1 and itself, it is not prime
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Display the result 
        if (isPrime) {
            System.out.println(number + " is a Prime Number");
        } else {
            System.out.println(number + " is not a Prime Number");
        }

        input.close();
    }
}