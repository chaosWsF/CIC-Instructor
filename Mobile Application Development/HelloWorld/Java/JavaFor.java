package com.coma102.helloworld;

public class JavaFor {
    public static void main(String args[]) {
        int total_sum = 0;
        for (int i = 1; i <= 1000; i++) {
            total_sum = total_sum + i;
            if (total_sum > 100) {
                break;
            }
        }
        System.out.println("Total sum is " + total_sum);
    }
}
