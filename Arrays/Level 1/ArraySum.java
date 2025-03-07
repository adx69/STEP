import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array to store up to 10 elements
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        System.out.println("Enter up to 10 positive numbers (enter 0 or negative number to stop):");

        // Input loop - continues until break condition
        while (true) {
            System.out.print("Enter number #" + (index + 1) + ": ");
            double input = scanner.nextDouble();

            // Check for terminating conditions
            if (input <= 0) {
                break;
            }

            // Store the entered number
            numbers[index] = input;
            index++;

            // Check if array is full
            if (index == 10) {
                System.out.println("Maximum capacity reached (10 numbers).");
                break;
            }
        }

        // Calculate sum of all entered numbers
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        // Display all entered numbers
        System.out.println("\nYou entered the following numbers:");
        for (int i = 0; i < index; i++) {
            System.out.println("Number #" + (i + 1) + ": " + numbers[i]);
        }

        // Display the total sum
        System.out.println("\nSum of all numbers: " + total);

        scanner.close();
    }
}