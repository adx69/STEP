import java.util.Scanner;

class SmallestOfThree { 
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
				
		System.out.print("Enter the number: ");
		int Number = input.nextInt();	
		
		if ( Number == 0){
			System.out.println("The Number is Zero");
		} else if ( Number > 0 ) {
			System.out.println("The Number is Positive");
		} else {
			System.out.println("The Number is Negative");
		}
		
	}
}