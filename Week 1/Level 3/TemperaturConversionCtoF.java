import java.util.Scanner;

class TemperaturConversion {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter Temperatur in Celsius: ");
		int TempInCelsius = input.nextInt();

		double TempInFahrenheit = (TempInCelsius*1.8)+32;

		System.out.print("The "+TempInCelsius+" celsius is "+TempInFahrenheit+" fahrenheit ");
	}
}