class Q04_profitloss {
	public static void main(String[] args) {
		// declaring variables
		double costprice = 129;
		double sellprice = 191;

		double profit = sellprice - costprice;
		double profitPer = (profit / costprice) * 100;

		System.out.println("The Cost Price is INR " + costprice + " and Selling Price is INR " + sellprice);
		System.out.println("The Profit is INR " + profit + " and the Profit Percentage is " + profitPer);
	}
}
