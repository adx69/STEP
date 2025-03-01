import java.util.Scanner;

class AllowedToVote { 
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
				
		System.out.print("Enter Your Age: ");
		int Age = input.nextInt();	
		
		if (Age == 18) {
			System.out.println("The person's age is " + Age + " and can vote");
		} else {
			System.out.print("The person's age is " + Age + " not allowed to Vote");
		}
		
	}
}