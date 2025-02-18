import java.util.Scanner;

class DoubleOpt {
    public static void main(String[] args) {
        // Initialize the Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the value for 'a'
        System.out.print("Enter value for a: ");
        double a = scanner.nextDouble();

        // Prompt the user to enter the value for 'b'
        System.out.print("Enter value for b: ");
        double b = scanner.nextDouble();

        // Prompt the user to enter the value for 'c'
        System.out.print("Enter value for c: ");
        double c = scanner.nextDouble();

        // Perform double operations
        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c;

        // Display the result
        System.out.println("The results of double operations are " + result1 + ", " + result2 + ", " + result3
                + ", and " + result4);

        scanner.close();
    }
}
