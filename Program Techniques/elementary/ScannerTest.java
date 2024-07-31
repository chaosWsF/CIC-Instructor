import java.util.* ; // Implicit import
//import java.util.Scanner; // Explicit Import

public class ScannerTest{
	 /** Main method */
	 public static void main(String[] args) {
	 	Scanner input = new Scanner(System.in);
	 	System.out.print("Enter a int value: ");
		//double d = input.nextDouble();
		int d = input.nextInt();
		System.out.println("The input number:" + d);
	 }
}