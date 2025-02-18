import java.util.Scanner;

class TemperaturConversionFToC {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter Temperatur in fahrenheit: ");
		double TempInFahrenheit = input.nextDouble();

		double TempInCelsius = (TempInFahrenheit-32)*0.5555555555555555;

		System.out.println("The "+TempInFahrenheit+" fahrenheit is "+TempInCelsius+" celsius ");
	}
}