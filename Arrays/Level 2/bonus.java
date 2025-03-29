import java.util.Scanner;

class Bonus {

    public static void main(String[] args) {

        // Creating scanner object

        Scanner sc = new Scanner(System.in);
		
		// Taking user input
		
        int numEmp = 10;
        double[] sal = new double[numEmp];
        double[] year = new double[numEmp];
        double[] bonus = new double[numEmp];
        double[] newSal = new double[numEmp];

        double totalBonus = 0, oldSal = 0, newSalary = 0;
		
		// 

        for (int i = 0; i < numEmp; i++) {
            System.out.print("Enter salary for employee " + (i + 1) + ": ");
            sal[i] = sc.nextDouble();
            System.out.print("Enter years of service for employee " + (i + 1) + ": ");
            year[i] = sc.nextDouble();
        }

		// 

        for (int i = 0; i < numEmp; i++) {
            if (year[i] > 5) {
                bonus[i] = sal[i] * 0.05; 
            } else {
                bonus[i] = sal[i] * 0.02; // 2% bonus
            }

            newSal[i] = sal[i] + bonus[i];
            totalBonus += bonus[i];
            oldSal += sal[i];
            newSalary += newSal[i];

        }
        // Printing results
        System.out.println("\nEmployee Salary Details:");

        for (int i = 0; i < numEmp; i++) {
            System.out.printf("Employee %d - Old Salary: %.2f, Bonus: %.2f, New Salary: %.2f\n",
                    (i + 1), sal[i], bonus[i], newSal[i]);

        }

        System.out.printf("\nTotal Bonus Payout: %.2f\n", totalBonus);
        System.out.printf("Total Old Salary: %.2f\n", oldSal);
        System.out.printf("Total New Salary: %.2f\n", newSalary);

    }

}