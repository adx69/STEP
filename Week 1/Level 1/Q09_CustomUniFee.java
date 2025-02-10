import java.util.Scanner;

class Q09_CustomUniFee {
	public static void main(String[] args) {
		double fee;
		Scanner input = new Scanner(System.in);
		fee = input.nextDouble();
		input.close();

		double discountPercent = 10;

		double discount = (discountPercent / 100) * fee;
		double finalfee = fee - discount;

		System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalfee);
	}
}
