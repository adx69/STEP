import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        // Initialize the Scanner 
        Scanner sc = new Scanner(System.in);

        // take input
        System.out.print("Enter a Number: ");
        int number = sc.nextInt();

        // Initialize a variable to count the number of digits
        int count = 0;

        // Loop until the number becomes 0
        while (number != 0) {
            // Remove the last digit of the number
            number = number / 10;

            // Increase the count of digits
            count++;
        }

        // Display the result
        System.out.println("Number of digits: " + count);

        sc.close();
    }
}
