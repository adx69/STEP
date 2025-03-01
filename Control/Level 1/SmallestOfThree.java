import java.util.Scanner;

class SmallestOfThree {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the First number: ");
		int FirstNumber = input.nextInt();

		System.out.print("Enter the Second number: ");
		int SecondNumber = input.nextInt();

		System.out.print("Enter the Third number: ");
		int ThirdNumber = input.nextInt();

		if (FirstNumber < SecondNumber && FirstNumber < ThirdNumber) {
			System.out.print("The First number is the Smallest.");
		} else if (SecondNumber < FirstNumber && SecondNumber < ThirdNumber) {
			System.out.print("The Second number is the Smallest.");
		} else {
			System.out.print("The Third number is the Smallest.");
		}
	}
}