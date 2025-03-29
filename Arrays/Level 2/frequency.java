import java.util.Scanner; 

class Friends { 

    public static void main(String[] args) { 
        //Creating scanner object 
        Scanner sc = new Scanner(System.in); 
        String[] friends = {"Amar", "Akbar", "Anthony"}; 
        int[] age = new int[3]; 
        double[] height = new double[3]; 
        // Taking user input for age and height 

        for (int i = 0; i < 3; i++) { 
            System.out.print("Enter age of " + friends[i] + ": "); 
            age[i] = sc.nextInt(); 
            System.out.print("Enter height (in cm) of " + friends[i] + ": ");
            height[i] = sc.nextDouble(); 
        } 

        // Finding the youngest friend 

        int youngest = 0; 
        for (int i = 1; i < 3; i++) { 
            if (age[i] < age[youngest]) { 
                youngest = i; 
            } 
        } 

        // Finding the tallest friend 

        int tallest = 0; 
        for (int i = 1; i < 3; i++) { 
            if (height[i] > height[tallest]) { 
                tallest = i; 
            }
        }       

        // Displaying results 

        System.out.println("\nYoungest Friend: " + friends[youngest] + " (Age: " + age[youngest] + ")"); 	
        System.out.println("Tallest Friend: " + friends[tallest] + " (Height: " + height[tallest] + " cm)"); 

    } 
}