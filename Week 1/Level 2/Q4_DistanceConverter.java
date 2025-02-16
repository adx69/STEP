import java.util.Scanner;

class Q4_DistanceConverter {
    public static void main(String[] args) {
        // Initialize the Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the distance in feet
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = scanner.nextDouble();

        // Convert the distance from feet to yards (1 yard = 3 feet)
        double distanceInYards = distanceInFeet / 3;

        // Convert the distance from yards to miles (1 mile = 1760 yards)
        double distanceInMiles = distanceInYards / 1760;

        // Display the result
        System.out.println("The distance in yards is " + distanceInYards + " and in miles is " + distanceInMiles);

        scanner.close();
    }
}
