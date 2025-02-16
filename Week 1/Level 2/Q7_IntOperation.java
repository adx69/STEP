import java.util.Scanner;

class Q7_IntOperation {
    public static void main(String[] args) {
        // Initialize the Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the value for 'a'
        System.out.print("Enter value for a: ");
        int a = scanner.nextInt();

        // Prompt the user to enter the value for 'b'
        System.out.print("Enter value for b: ");
        int b = scanner.nextInt();

        // Prompt the user to enter the value for 'c'
        System.out.print("Enter value for c: ");
        int c = scanner.nextInt();

        // Perform integer operations
        int result1 = a + b * c; // Multiplication has higher precedence than addition
        int result2 = a * b + c; // Multiplication has higher precedence than addition
        int result3 = c + a / b; // Division has higher precedence than addition
        int result4 = a % b + c; // Modulus has higher precedence than addition

        // Display the result
        System.out.println("The results of integer operations are " + result1 + ", " + result2 + ", " + result3
                + ", and " + result4);

        scanner.close();
    }
}
