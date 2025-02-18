import java.util.Scanner;

class TravelComputation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter your name, from which city you're going, via which city and to which city");
		String name = input.nextLine();
		String fromCity = input.nextLine();
		String viaCity = input.nextLine();
		String toCity = input.nextLine();

		System.out.println("Enter the distance from your city to via city then your destination city, in miles and the time taken to reach via city then your destation city");

		double distanceFromToVia = input.nextDouble();
		double distanceViaToFinalCity = input.nextDouble();

		int timeFromToVia = input.nextInt()* 60;
		int timeViaToFinalCity = input.nextInt()* 60;

		double totalDistance = distanceFromToVia + distanceViaToFinalCity;

		int totalTime = timeFromToVia + timeViaToFinalCity;

		System.out.println("The Total Distance travelled by " + name + " from " +
					 fromCity + " to " + toCity + " via " + viaCity +
					 " is " + totalDistance + " km and " +
					 "the Total Time taken is " + totalTime + " minutes");

		input.close();
	}
}
