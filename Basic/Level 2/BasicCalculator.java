import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter first number: ");
        float number1 = scanner.nextFloat();

        // Prompt the user to enter the second number
        System.out.print("Enter second number: ");
        float number2 = scanner.nextFloat();

        // Perform basic arithmetic operations
        float addition = number1 + number2;
        float subtraction = number1 - number2;
        float multiplication = number1 * number2;
        float division = number1 / number2;

        // Display the results
        System.out.println("The addition, subtraction, multiplication, and division of numbers " + number1 + " and "
                + number2 + " are "
                + addition + ", " + subtraction + ", " + multiplication + ", and " + division);

        scanner.close();
    }
}
