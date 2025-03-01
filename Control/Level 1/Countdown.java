import java.util.Scanner;

class Countdown {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the countdown value: ");
        int counter = input.nextInt();

        input.close();

        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }

    }
}