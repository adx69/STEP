import java.util.Scanner;

class SwapTwoNumbers {
	public static void main(String[] args) {
		int number1;
		int number2;
		int temp;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first Number: ");
        number1 = input.nextInt();
		
		System.out.print("Enter the second Number: ");
        number2 = input.nextInt();
		
		temp = number1;
		number1 = number2;
		number2 = temp;
		
		System.out.print("The swapped numbers are " + number1 + " and " + number2);
		input.close();
		
	}
}