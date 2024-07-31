/**
 * Default to get Summary(1): java Assignment1.java
 * To compute Summary(10): java Assignment1.java 10
 * To compute Summary(100): java Assignment1.java 100
 */
public class Assignment1 {
    public static void main(String[] args) {
        if (args.length > 0) {
            int num = Integer.parseInt(args[0]);
            System.out.printf("Summary(%d) = %d%n", num, getSum(num));
        } else {
            System.out.println("Summary(1) = " + getSum(1));
        }
    }

    public static int getSum(int n) {
        // Using recursion
        if (n == 0) {
            return 0;
        } else {
            return n + getSum(n-1);
        }
    }
}