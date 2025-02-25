import java.util.Scanner;

class LargestNumber{
	public static void main(String[] args){
		
		// Take input from user
		
		System.out.print("Enter the First number: ");
		Scanner input = new Scanner(System.in);
		int FirstNumber = input.nextInt();	
		
		System.out.print("Enter the Second number: ");
		int SecondNumber = input.nextInt();	
		
		System.out.print("Enter the Third number: ");
		int ThirdNumber = input.nextInt();	
		
		// Use if else to print the largest number and dispaly the results
		
		if (FirstNumber > SecondNumber && FirstNumber > ThirdNumber) {
			System.out.print("The First number is the largest.");
		} else if (SecondNumber > ThirdNumber && SecondNumber > ThirdNumber) {
			System.out.print("The Second number is the largest.");
		}
		else {
			System.out.print("The Third number is the largest.");
		}
		
	}
}