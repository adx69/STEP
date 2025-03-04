import java.util.Scanner;

public class LeapOrNot {
    public static void main(String[] args) {
        // Initialize the Scanner 
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a year
        System.out.print("Enter the Year: ");
        int year = sc.nextInt();

        // Check if the year is greater than or equal to 1582 
        if (year >= 1582) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println(year + " is a Leap Year");
                    } else {
                        System.out.println(year + " is not a Leap Year");
                    }
                } else {
                    System.out.println(year + " is a Leap Year");
                }
            } else {
                System.out.println(year + " is not a Leap Year");
            }
        } else {
            System.out.println("Year must be greater than or equal to 1582");
        }

        sc.close();
    }
}
