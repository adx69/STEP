import java.util.Scanner;

public class ChocolateDivision {

    // Method to find the quotient (chocolates per child) and remainder (remaining
    // chocolates)
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor; // Chocolates each child gets
        int remainder = number % divisor; // Remaining chocolates
        return new int[] { quotient, remainder };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of chocolates and children
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();

        // Validate input
        if (numberOfChildren <= 0) {
            System.out.println("The number of children must be greater than zero.");
        } else {
            // Call the method to calculate quotient and remainder
            int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

            // Display the results
            System.out.println("Each child will get " + result[0] + " chocolates.");
            System.out.println("Remaining chocolates: " + result[1]);
        }

        scanner.close();
    }
}