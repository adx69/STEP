import java.util.Scanner;

class Q08_CustomDistKmtoMile {
	public static void main(String[] args) {
		double km;
		double onekm = 1.6;
		Scanner input = new Scanner(System.in);
		km = input.nextInt();

		double InMile = km * onekm;
		System.out.println("The total miles is " + InMile + " mile for the given " + km + " km");
		input.close();
	}
}
