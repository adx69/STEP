import java.util.Scanner;

class NumberOfRounds {
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.println("Enter side1 in m");
		int side1=input.nextInt();

		System.out.println("Enter side2 in m");
		int side2=input.nextInt();

		System.out.println("Enter side3 in m");
		int side3=input.nextInt();

		int perimeter= side1+ side2+side3;
		int NoOfRounds= 5000/perimeter;

		System.out.println("The total number of rounds the athlete will run is "+NoOfRounds+" to complete 5 km");
		input.close();
	}
}