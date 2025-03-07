import java.util.Scanner;

public class FactorsFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get user input
        System.out.print("Enter a positive number to find its factors: ");
        int number = scanner.nextInt();
        
        // Validate input
        if (number <= 0) {
            System.out.println("Error: Please enter a positive number.");
            scanner.close();
            return;
        }
        
        // Initialize variables for storing factors
        int maxFactor = 10;  // Initial size of array
        int[] factors = new int[maxFactor];
        int index = 0;
        
        // Find factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // This is a factor
                
                // Check if array is full
                if (index == maxFactor) {
                    // Need to resize array
                    maxFactor *= 2;  // Double the size
                    int[] temp = new int[maxFactor];
                    
                    // Copy existing elements to new array
                    for (int j = 0; j < index; j++) {
                        temp[j] = factors[j];
                    }
                    
                    // Update reference to new array
                    factors = temp;
                }
                
                // Add factor to array
                factors[index] = i;
                index++;
            }
        }
        
        // Display factors
        System.out.print("Factors of " + number + ": ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i]);
            if (i < index - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        
        // Display total count of factors
        System.out.println("Total number of factors: " + index);
        
        scanner.close();
    }
}