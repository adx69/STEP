import java.util.Scanner;

class TemperaturConversion {
	public static void main(String[] args) {
		// Initialize the Scanner object to read user input
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter the temperature in Celsius
		System.out.print("Enter Temperatur in Celsius: ");
		int TempInCelsius = input.nextInt();

		// Convert the temperature from Celsius to Fahrenheit using the formula:
		// (Celsius * 1.8) + 32
		double TempInFahrenheit = (TempInCelsius * 1.8) + 32;

		// Display the temperature in both Celsius and Fahrenheit
		System.out.print("The " + TempInCelsius + " celsius is " + TempInFahrenheit + " fahrenheit ");

		// Close the scanner to avoid resource leaks
		input.close();
	}
}