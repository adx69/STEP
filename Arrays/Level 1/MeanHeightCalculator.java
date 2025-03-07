import java.util.Scanner;

public class MeanHeightCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create an array to store the heights of 11 players
        double[] heights = new double[11];
        double sum = 0;
        
        // Get height input for each player
        System.out.println("Enter the height of 11 football players (in cm):");
        
        for (int i = 0; i < 11; i++) {
            System.out.print("Player #" + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();
            
            // Add height to sum
            sum += heights[i];
        }
        
        // Calculate mean height
        double meanHeight = sum / 11;
        
        // Display the mean height
        System.out.println("\nHeights of all players:");
        for (int i = 0; i < 11; i++) {
            System.out.println("Player #" + (i + 1) + ": " + heights[i] + " cm");
        }
        
        System.out.printf("\nMean height of the football team: %.2f cm", meanHeight);
        
        scanner.close();
    }
}