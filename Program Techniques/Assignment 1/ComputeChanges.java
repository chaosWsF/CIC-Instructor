import java.util.Scanner;

public class ComputeChanges {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Money in dollars (two decimal places) = ");
        double value = input.nextDouble();

        int cents = (int)(value * 100);    // TypeCasting

        int dollars = cents / 100;
        cents = cents % 100;

        int quarters = cents / 25;
        cents = cents % 25;

        int dimes = cents / 10;
        cents = cents % 10;

        int nickels = cents / 5;
        cents = cents % 5;

        int pennies = cents;

        System.out.printf(
            "%.2f dollars = %d dollars + %d quarters + %d dimes + %d nickels + %d pennies%n", 
            value, 
            dollars, 
            quarters, 
            dimes, 
            nickels, 
            pennies
        );

        input.close();
    }
}