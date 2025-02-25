import java.util.Scanner;

class SquareSide {
    public static void main(String[] args) {
        // Initialize the Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the perimeter of the square
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = scanner.nextDouble();

        // Calculate the length of the side of the square using the formula:
        double side = perimeter / 4;

        // Display the Result
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);

        scanner.close();
    }
}
