import java.util.Scanner;

public class Array2Dto1D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get dimensions from user
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        
        System.out.print("Enter number of columns: ");
        int columns = scanner.nextInt();
        
        // Validate input
        if (rows <= 0 || columns <= 0) {
            System.out.println("Error: Rows and columns must be positive numbers.");
            scanner.close();
            return;
        }
        
        // Create 2D array
        int[][] matrix = new int[rows][columns];
        
        // Get user input for matrix elements
        System.out.println("\nEnter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        // Display 2D array (matrix)
        System.out.println("\nThe 2D matrix is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        
        // Create 1D array to store all elements
        int[] array = new int[rows * columns];
        int index = 0;
        
        // Copy elements from 2D array to 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index] = matrix[i][j];
                index++;
            }
        }
        
        // Display 1D array
        System.out.println("\nThe 1D array is:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        
        scanner.close();
    }
}