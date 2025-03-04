import java.util.Scanner;

public class LogicalLeapOrNot {
    public static void main(String[] args) {
        // Initialize the Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a year
        System.out.print("Enter the Year: ");
        int year = sc.nextInt();

        // Check if the year is greater than or equal to 1582 
        if (year >= 1582 && (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))) {
            // If true, the year is a leap year
            System.out.println(year + " is a Leap Year");
        } else {
            // If false, the year is not a leap year
            System.out.println(year + " is not a Leap Year");
        }

        // Close the scanner to avoid resource leaks
        sc.close();
    }
}
