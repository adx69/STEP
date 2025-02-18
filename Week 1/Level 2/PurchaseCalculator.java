import java.util.Scanner;

class PurchaseCalculator {
    public static void main(String[] args) {
        // Initialize the Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the unit price of the item
        System.out.print("Enter the unit price of the item: ");
        double unitPrice = scanner.nextDouble();

        // Prompt the user to enter the quantity of the item
        System.out.print("Enter the quantity: ");
        int quantity = scanner.nextInt();

        // Calculate the total purchase price
        double totalPrice = unitPrice * quantity;

        // Display the result
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity is " + quantity
                + " and unit price is INR " + unitPrice);

        scanner.close();
    }
}
