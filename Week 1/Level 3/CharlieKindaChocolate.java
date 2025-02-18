import java.util.Scanner;

class CharlieKindaChocolate {
public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.println("Enter  number of chocolates and number of Children");
		int  numberOfchocolates = input.nextInt();
		int  numberOfChildren = input.nextInt();

		int chocolatesPerPerson = numberOfchocolates / numberOfChildren;
		int chocolatesLeft = numberOfchocolates % numberOfChildren;

		System.out.println("The number of chocolates each child gets is "+chocolatesPerPerson+" and the number of remaining chocolates are "+chocolatesLeft);

		input.close();
	}
}
