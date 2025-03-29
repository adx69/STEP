class largest {
public static void main(String[] args) {
//Creating scanner object
Scanner sc = new Scanner(System.in);
// Taking user input
System.out.print(&quot;Enter a number: &quot;);
int num = sc.nextInt();
int max = 10; // Initial maximum number of digits to store
int[] digits = new int[max];
int ind = 0;
// Extract digits and store in array
while (num != 0) {
if (ind == max) {
max *= 2;
int[] temp = new int[max];
for (int i = 0; i &lt; digits.length; i++) {
temp[i] = digits[i];
}
digits = temp;
}
digits[ind++] = num % 10;
num /= 10;
}
int temp;
// sorting the array in descending order
for (int i = 0; i &lt; ind; i++) {
for (int j = i + 1; j &lt; ind; j++) {
if (digits[i] &lt; digits[j]) {
temp = digits[i];
digits[i] = digits[j];
digits[j] = temp;
}
}
}
// Displaying the results
System.out.println(&quot;Largest Digit: &quot; + digits[0]);
System.out.println(&quot;Second Largest Digit: &quot; + digits[1]);
}
}