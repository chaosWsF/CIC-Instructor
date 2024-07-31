package com.coma102.helloworld;

public class JavaWhile {
    public static void main(String args[]) {
        int total_sum = 0;
        int i = 1;
        while (total_sum <= 100) {
            total_sum = total_sum + i;
            i++;
        }
        System.out.println("Total sum is " + total_sum);
        System.out.println("Last added number is " + (i-1));
    }
}
