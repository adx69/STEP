import java.util.Scanner;

public class TriangularParkRun {

    // Method to calculate the perimeter of the triangle
    public static double calculatePerimeter(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }

    // Method to calculate the number of rounds
    public static int calculateRounds(double perimeter, double totalDistance) {
        return (int) Math.ceil(totalDistance / perimeter);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the sides of the triangular park
        System.out.print("Enter the length of side 1 (in meters): ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the length of side 2 (in meters): ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the length of side 3 (in meters): ");
        double side3 = scanner.nextDouble();

        // Calculate the perimeter of the triangle
        double perimeter = calculatePerimeter(side1, side2, side3);

        // Convert 5 km to meters
        double totalDistance = 5000;

        // Calculate the number of rounds
        int rounds = calculateRounds(perimeter, totalDistance);

        // Display the result
        System.out.println("The athlete needs to complete " + rounds + " rounds to run 5 km.");

        scanner.close();
    }
}