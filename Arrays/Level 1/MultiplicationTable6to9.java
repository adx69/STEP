import java.util.Scanner;

public class MultiplicationTable6to9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter a number to generate its multiplication table: ");
        int number = scanner.nextInt();

        // Define an array to store the results (for multiplications by 6, 7, 8, 9)
        int[] multiplicationResult = new int[4];

        // Calculate multiplication table for 6 to 9 and store in array
        for (int i = 0; i < 4; i++) {
            // Calculate for values 6, 7, 8, 9
            int multiplier = i + 6;
            multiplicationResult[i] = number * multiplier;
        }

        // Display the multiplication table
        System.out.println("Multiplication Table of " + number + " (from 6 to 9):");
        for (int i = 0; i < 4; i++) {
            int multiplier = i + 6;
            System.out.println(number + " * " + multiplier + " = " + multiplicationResult[i]);
        }

        scanner.close();
    }
}