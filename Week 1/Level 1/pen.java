class pen {
	public static void main(String[] args) {
		int pens = 13;
		int students = 3;

		int sharedPen = pens / students;
		int leftPens = pens % students;

		System.out.println(
				"The Pen Per Student is " + sharedPen + " and the remaining pen not distributed is " + leftPens);
	}
}
