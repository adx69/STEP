import java.util.Scanner;

class VotingCheck {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Create an array to store ages of 10 students
        int[] ages = new int[10];

        // Prompt the user to enter ages
        System.out.println("Enter the age of 10 students:");

        // Loop to collect 10 ages from the user
        for (int i = 0; i < ages.length; i++) {
            ages[i] = scanner.nextInt();
        }

        // Enhanced for loop to process each age in the array
        for (int age : ages) {
            // Check if age is valid (non-negative)
            if (age < 0) {
                System.out.println("Invalid age: " + age);
            }
            // Check if student is eligible to vote (18 or older)
            else if (age >= 18) {
                System.out.println("The student with the age " + age + " can vote.");
            }
            // If age is valid but less than 18, student cannot vote
            else {
                System.out.println("The student with the age " + age + " cannot vote.");
            }
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}