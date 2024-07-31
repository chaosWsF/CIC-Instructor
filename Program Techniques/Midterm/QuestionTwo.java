import java.util.Scanner;

public class QuestionTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int a = input.nextInt();

        System.out.println("a = " + a);

        input.close();
    }
}