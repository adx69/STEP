import java.util.Scanner;

class DivisibleByFive{
	public static void main(String[] args){
		
		// Take input from user
		
		System.out.print("Enter the number: ");
		Scanner input = new Scanner(System.in);
		int NumberToCheck = input.nextInt();	
		
		// Use if else to check if it is divisble by five and display the results automatically
		
		if ( NumberToCheck % 5 == 0 ){
			System.out.println("Is the number " + NumberToCheck + " divisible by 5? Yes");
		} else {
			System.out.println("Is the number " + NumberToCheck + " divisible by 5? No");
		}
		
		// Close Scanner
		
		input.close();
	}
}