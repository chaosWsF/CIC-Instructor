package com.coma102.helloworld;

public class JavaWhile2 {
    public static void main(String args[]) {
        int total_sum = 0;
        int i = 1;
        while (i <= 3) {
            if (i == 2) {
                i++;
                continue;
            }
            total_sum = total_sum + i;
            i++;
        }
        System.out.println("Total sum is " + total_sum);
    }
}
