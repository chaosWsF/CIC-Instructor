public class MidtermQuestion {
    public static void main(String[] args) {
        int num = 10;
		long fib = fibFun(num);
		System.out.println("Fibonacci of " + num + " = " + fib);
    }

	public static long fibFun(int n) {
		long f0 = 0;
		long f1 = 1;
		long f2 = 1;

		if (n == 0)
			return f0;
		else if (n == 1)
		  	return f1;
		else if (n == 2)
			return f2;
		
		for (int i = 3; i <= n; i++) {
			f0 = f1;
			f1 = f2;
			f2 = f0 + f1;
		}
		
		return f2;
	}
}