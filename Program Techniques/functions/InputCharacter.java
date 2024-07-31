import java.util.Scanner;

public class InputCharacter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter character: ");
		String s = input.nextLine();
		char ch = s.charAt(0);
		System.out.println("The character entered is " + ch);
	 }
 }