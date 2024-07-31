public class GCD {
	//Approach 1
	public static int gcdByBruteForce(int n1, int n2) {
		int gcd = 1;
		for (int i = 1; i <= n1 && i <= n2; i++) {
			//n1=m, n2=n
			if (n1 % i == 0 && n2 % i == 0) {
				gcd = i;
			}
		}
		return gcd;
	}

	public static int gcdByEuclidsAlgorithm(int n1, int n2) {
		//Approach 2
		// Get absolute value of m and n;
		int t1 = Math.abs(n1);
		int t2 = Math.abs(n2);
		// r is the remainder of t1 divided by t2;
		int r = t1 % t2;
		while (r != 0) {
			t1 = t2;
			t2 = r;
			r = t1 % t2;
		}
		return t2;
	}

	public static int gcdByEuclidsRecursive(int n1, int n2) {
		//Approach 3
		if (n2 == 0) {
			return n1;
		}
		return gcdByEuclidsRecursive(n2, n1 % n2);
	}

	public static void main(String [] args) {
		//int gcd = gcdByBruteForce(25, 35);
		//int gcd = gcdByEuclidsAlgorithm(25, 35);
		int gcd = gcdByEuclidsRecursive(25, 35);

			System.out.println("GCD = " + gcd );

	}
}