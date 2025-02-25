import java.util.Scanner;

class TravelComputation {

	public static void main(String[] args) {
		// Initialize the Scanner object to read user input
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter their name, from which city they are going, via
		// which city, and to which city
		System.out.println("Enter your name, from which city you're going, via which city and to which city");
		String name = input.nextLine();
		String fromCity = input.nextLine();
		String viaCity = input.nextLine();
		String toCity = input.nextLine();

		// Prompt the user to enter the distances and times
		System.out.println(
				"Enter the distance from your city to via city then your destination city, in miles and the time taken to reach via city then your destination city");

		// Read the distances from the user
		double distanceFromToVia = input.nextDouble();
		double distanceViaToFinalCity = input.nextDouble();

		// Read the times from the user and convert them to minutes
		int timeFromToVia = input.nextInt() * 60;
		int timeViaToFinalCity = input.nextInt() * 60;

		// Calculate the total distance traveled
		double totalDistance = distanceFromToVia + distanceViaToFinalCity;

		// Calculate the total time taken
		int totalTime = timeFromToVia + timeViaToFinalCity;

		// Display the total distance and time taken
		System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity + " via "
				+ viaCity + " is " + totalDistance + " km and the Total Time taken is " + totalTime + " minutes");

		// Close the scanner to avoid resource leaks
		input.close();
	}
}
