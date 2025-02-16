import java.util.Scanner;

class Q2_TriangleArea {
    public static void main(String[] args) {
        // Initialize the Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the base of the triangle
        System.out.print("Enter base of the triangle: ");
        double base = scanner.nextDouble();

        // Prompt the user to enter the height of the triangle
        System.out.print("Enter height of the triangle: ");
        double height = scanner.nextDouble();

        // Calculate the area of the triangle using the formula: 0.5 * base * height
        double area = 0.5 * base * height;

        // Display the calculated area of the triangle
        System.out.println("The area of the triangle is: " + area + " square units");

        scanner.close();
    }
}
