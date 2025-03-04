import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        // Initialize the Scanner
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter weight in kg: ");
        double weight = sc.nextDouble();

        System.out.print("Enter height in cm: ");
        double height = sc.nextDouble();

        // Convert height from centimeters to meters
        height = height / 100;

        // Calculate BMI using the formula
        double bmi = weight / (height * height);

        // Display the calculated BMI
        System.out.printf("BMI: %.2f\n", bmi);

        // Determine the BMI category based on the calculated BMI
        if (bmi <= 18.4) {
            System.out.println("Status: Underweight");
        } else if (bmi <= 24.9) {
            System.out.println("Status: Normal");
        } else if (bmi <= 39.9) {
            System.out.println("Status: Overweight");
        } else {
            System.out.println("Status: Obese");
        }

        sc.close();
    }
}
