package com.coma102.helloworld;

public class JavaDoWhile {
    public static void main(String args[]) {
        int total_sum = 0;
        int i = 1;
        do {
            total_sum = total_sum + i;
            i++;
        } while (total_sum <= 100);    // do-while loop ends here
        System.out.println("Total sum is " + total_sum);
        System.out.println("Last added number is " + (i-1));
    }
}
