import java.util.Scanner;

public class HandshakeCount {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		int numberOfStudents = input.nextInt();
		
		int PossibleHandshake = (numberOfStudents * (numberOfStudents - 1)) / 2;
		
		System.out.print("The Possible Number of handshake are " + PossibleHandshake);		
		
	}
}