import java.util.Scanner;

public class GitTest01 {

	public static Scanner scan;

	
	
	
	public static void main(String[] args) {
		reverseString();
	}
	
	public static void reverseString() {
		scan = new Scanner(System.in);
		
		System.out.println("Enter A NAME");

		String name = scan.nextLine();

		String reverse = "";

		int length = name.length();

		for (int i = length - 1; i >= 0; i--) {

			reverse += name.charAt(i);

		}

		System.out.println("The Reverse is ===>" + reverse);
		System.out.println("The Length is ===>" + length);

	}

}
