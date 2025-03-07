public class NumberCheck {
    public static void main(String[] args) {
        // Create a Scanner object to read user input from the console
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Declare an integer array to store 5 numbers
        int[] numbers = new int[5];

        // Prompt the user to enter 5 numbers
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            // Read each number from the console and store it in the array
            numbers[i] = scanner.nextInt();
        }

        // Loop through the array to check if the numbers are negative, zero, or
        // positive
        // If positive, determine whether they are even or odd
        for (int num : numbers) {
            if (num < 0) {
                System.out.println(num + " is negative.");
            } else if (num == 0) {
                System.out.println(num + " is zero.");
            } else {
                // For positive numbers, check if they are even or odd
                if (num % 2 == 0) {
                    System.out.println(num + " is positive and even.");
                } else {
                    System.out.println(num + " is positive and odd.");
                }
            }
        }

        // Compare the first array element with the last one
        System.out.println("\nComparing the first and last element:");
        if (numbers[0] > numbers[4]) {
            System.out.println(numbers[0] + " is greater than " + numbers[4]);
        } else if (numbers[0] < numbers[4]) {
            System.out.println(numbers[0] + " is less than " + numbers[4]);
        } else {
            System.out.println(numbers[0] + " is equal to " + numbers[4]);
        }

        // Close the Scanner to free system resources
        scanner.close();
    }
}