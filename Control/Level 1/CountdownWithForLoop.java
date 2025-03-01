

public class CountdownWithForLoop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the countdown value: ");
        int counter = input.nextInt();
        input.close();
        int counter = 10;

        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }
    }

}
