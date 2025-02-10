class Q07_volOfEarth {
	public static void main(String[] args) {

		// declaring variables
		double radius = 6378;
		double pi = 3.14;
		double vol = (pi * radius * radius * radius * 4) / 3;

		double oneKm = 4.16818183;

		double volInMiles = vol * oneKm;

		System.out.println("The volume of earth in cubic kilometers is " + vol + " and cubic miles is " + volInMiles);
	}
}
