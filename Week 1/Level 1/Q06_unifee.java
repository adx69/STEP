class Q06_unifee {
	public static void main(String[] args) {

		// Declaaring Variabels
		double fee = 125000;
		double discountPercent = 10;

		double discount = (discountPercent / 100) * fee;
		double finalfee = fee - discount;

		System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalfee);
	}
}
