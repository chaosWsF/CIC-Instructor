package com.coma102.helloworld;

public class JavaArray {
    public static void main(String args[]) {
        char[] myArray = {'J', 'a', 'v', 'a'};
        // System.out.println(myArray[0]);
        System.out.println(myArray[1]);

        myArray[1] = 'v';
        System.out.println(myArray[1]);

        // System.out.println(myArray[4]);    // Error

        float[] myArray1 = {1.1f, 1.2f, 3.2f};
        System.out.println("[" + myArray1[0] + ", " + myArray1[1] + ", " + myArray1[2] + "]");
    }
}
