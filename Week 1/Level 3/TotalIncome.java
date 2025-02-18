import java.util.Scanner;

class TotalIncome {
public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter Salary: ");
		double salary = input.nextInt();

		System.out.println("Enter bonous: ");
		double bonous = input.nextInt();

		double TotalIncome=salary+bonous;

		System.out.print("The salary is INR "+ salary +" and bonus is INR " + bonous+ ". Hence Total Income is INR " + TotalIncome);
	}
}