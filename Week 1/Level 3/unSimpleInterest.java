import java.util.Scanner;

class unSimpleInterest {
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.println("Enter principal amount");
		double principal=input.nextDouble();

		System.out.println("Enter rate of interst");
		double rate=input.nextDouble();

		System.out.println("Enter the time perriod in days");
		double time=input.nextDouble()*24;

		double SimpleInterest=(principal*rate*time);
		SimpleInterest/=100;

		System.out.println("The Simple Interest is "+SimpleInterest+" for Principal "+principal+", Rate of Interest "+rate+" and Time "+time);

		input.close();
	}
}