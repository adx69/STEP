import java.util.Scanner;

class SumOfNaturalNumber { 
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of Natural Numbers to take: ");
		double NumberOfNaturalNumbers = input.nextInt();	
		
		double sumOfNaturalNumbers = NumberOfNaturalNumbers * ( (NumberOfNaturalNumbers + 1) / 2 );
		
		System.out.print(sumOfNaturalNumbers);
		
	}
}