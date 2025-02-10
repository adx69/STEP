import java.util.Scanner;

class Q10_height {
  public static void main(String[] args) {

    // Declaring variable to store height in centimeter
    double heightCentimeter;

    // Creating Scanner object to take input from user
    Scanner input = new Scanner(System.in);

    // Reading Height
    System.out.println("Enter the height in Centimeter:");
    heightCentimeter = input.nextDouble();

    // Closing Scanner Object
    input.close();

    // Computing Height in Feet and inches
    double heightInches = heightCentimeter / 2.54;
    double heightFeet = heightInches / 12;
    heightInches = heightInches % 12;
    double heightInchesInt = heightInches;
    double heightFeetInt = heightFeet;

    // Display after conversion
    System.out.println("Your Height in cm is " + heightCentimeter + " while in feet is " + heightFeetInt
        + " and inches is " + heightInchesInt);

  }
}
