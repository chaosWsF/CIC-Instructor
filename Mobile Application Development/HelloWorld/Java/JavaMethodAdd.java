package com.coma102.helloworld;

public class JavaMethodAdd {
    public static void main(String args[]) {
        int res = 2 * addNumbers(2, 5) + 4;
        System.out.println(res);
    }

    static int addNumbers(int a, int b) {
        int sum_numbers;
        sum_numbers = a + b;
//        int sum_numbers = a + b;
        return sum_numbers;
    }
}
