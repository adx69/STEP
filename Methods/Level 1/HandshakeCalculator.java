import java.util.Scanner;

public class HandshakeCalculator {

    // Method to calculate the maximum number of handshakes
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of students
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        // Validate input
        if (n < 2) {
            System.out.println("The number of students must be at least 2 to have handshakes.");
        } else {
            // Calculate the maximum number of handshakes
            int handshakes = calculateHandshakes(n);

            // Output the result
            System.out.println("The maximum number of handshakes among " + n + " students is: " + handshakes);
        }

        scanner.close();
    }
}