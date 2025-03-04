import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        // Initialize the Scanner
        Scanner sc = new Scanner(System.in);

        // tuke input from user
        System.out.print("Enter Physics Marks: ");
        float physics = sc.nextFloat();

        System.out.print("Enter Chemistry Marks: ");
        float chemistry = sc.nextFloat();

        System.out.print("Enter Maths Marks: ");
        float maths = sc.nextFloat();

        // Calculate the total marks
        float total = physics + chemistry + maths;

        // Calculate the percentage
        float percentage = (total / 300) * 100;

        // Display the average percentage
        System.out.printf("Average Percentage: %.2f%%\n", percentage);

        // Determine the grade and remarks based on the percentage
        if (percentage >= 80) {
            System.out.println("Grade: A");
            System.out.println("Remarks: Level 4, above agency-normalized standards");
        } else if (percentage >= 70) {
            System.out.println("Grade: B");
            System.out.println("Remarks: Level 3, at agency-normalized standards");
        } else if (percentage >= 60) {
            System.out.println("Grade: C");
            System.out.println("Remarks: Level 2, below, but approaching agency-normalized standards");
        } else if (percentage >= 50) {
            System.out.println("Grade: D");
            System.out.println("Remarks: Level 1, well below agency-normalized standards");
        } else if (percentage >= 40) {
            System.out.println("Grade: E");
            System.out.println("Remarks: Level 1, too below agency-normalized standards");
        } else {
            System.out.println("Grade: R");
            System.out.println("Remarks: Remedial standards");
        }

        sc.close();
    }
}
