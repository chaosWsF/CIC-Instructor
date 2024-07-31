public class PrintRecur {

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Print " + n + " times");
        nPrintln("Welcome", n);
    }
    public static void nPrintln(String message, int n) {
		if (n >= 1) {
			System.out.println(message + " " + n);
			nPrintln(message, n - 1);
		} // The base case is n < 1
	}
}