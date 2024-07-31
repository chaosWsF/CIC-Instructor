public class Factorial {

    public static void main(String[] args) {
        int num = 4;
        long factorial = factorialFun(num);
        System.out.println("Factorial of " + num + " = " + factorial); //caculate 4!
    }
    public static long factorialFun(int num)
    {
        if (num == 0)
           return 1; //base case or stop case
        else
           return num * factorialFun(num - 1); //size reduces 1

    }
}