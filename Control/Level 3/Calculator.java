import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        double first = input.nextDouble();
        System.out.print("Enter Second Number: ");
        double second = input.nextDouble();
        System.out.print("Enter Operator (+, -, *, /): ");
        String op = input.next();

        switch (op) {
            case "+":
                System.out.println("Result: " + (first + second));
                break;
            case "-":
                System.out.println("Result: " + (first - second));
                break;
            case "*":
                System.out.println("Result: " + (first * second));
                break;
            case "/":
                if (second != 0) {
                    System.out.println("Result: " + (first / second));
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;
            default:
                System.out.println("Invalid Operator");
        }
        input.close();
    }
}