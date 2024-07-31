public class Fibonacci {

    public static void main(String[] args) {
        int num = 30;
        long fibonacci = fibonacciFun(num);
        System.out.println("Fibonacci of " + num + " = " + fibonacci);
    }
	public static long fibonacciFun(int n)  {
		if(n == 0)
			return 0;
		else if(n == 1)
		  	return 1;
		else
		  return fibonacciFun(n - 1) + fibonacciFun(n - 2);
	}
}













/*
n fibonacci sequence each item is the sum of the previous two. So, you wrote a recursive algorithm.

So,

fibonacci(5) = fibonacci(4) + fibonacci(3)

fibonacci(3) = fibonacci(2) + fibonacci(1)

fibonacci(4) = fibonacci(3) + fibonacci(2)

fibonacci(2) = fibonacci(1) + fibonacci(0)
Now you already know fibonacci(1)==1 and fibonacci(0) == 0. So, you can subsequently calculate the other values.

Now,

fibonacci(2) = 1+0 = 1
fibonacci(3) = 1+1 = 2
fibonacci(4) = 2+1 = 3
fibonacci(5) = 3+2 = 5
And from fibonacci sequence 0,1,1,2,3,5,8,13,21.... we can see that for 5th element the fibonacci sequence returns 5.

*/