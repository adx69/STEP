import java.util.Scanner;

class TemperaturConversionFToC {
	public static void main(String[] args) {
		// Initialize the Scanner object to read user input
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter the temperature in Fahrenheit
		System.out.print("Enter Temperatur in fahrenheit: ");
		double TempInFahrenheit = input.nextDouble();

		// Convert the temperature from Fahrenheit to Celsius using the formula:
		// (Fahrenheit - 32) * 0.5555555555555555
		double TempInCelsius = (TempInFahrenheit - 32) * 0.5555555555555555;

		// Display the temperature in both Fahrenheit and Celsius
		System.out.println("The " + TempInFahrenheit + " fahrenheit is " + TempInCelsius + " celsius ");

		// Close the scanner to avoid resource leaks
		input.close();
	}
}