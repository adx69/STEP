import java.util.Scanner;

public class FriendsInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[3];
        double[] heights = new double[3];
        String[] names = { "Amar", "Akbar", "Anthony" };
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height of " + names[i] + ": ");
            heights[i] = sc.nextDouble();
        }
        int youngest = ages[0];
        double tallest = heights[0];
        String youngestName = names[0], tallestName = names[0];
        for (int i = 1; i < 3; i++) {
            if (ages[i] < youngest) {
                youngest = ages[i];
                youngestName = names[i];
            }
            if (heights[i] > tallest) {
                tallest = heights[i];
                tallestName = names[i];
            }
        }
        System.out.println("Youngest Friend: " + youngestName);
        System.out.println("Tallest Friend: " + tallestName);
    }
}
