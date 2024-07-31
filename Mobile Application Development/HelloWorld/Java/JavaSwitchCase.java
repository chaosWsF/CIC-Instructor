package com.coma102.helloworld;

public class JavaSwitchCase {
    public static void main(String args[]) {
        char grade = 'B';
        switch (grade) {
            case 'A':
                System.out.println("Your grade is excellent.");
                break;
            case 'B':
                System.out.println("Your grade is very good.");
                break;
            case 'C':
                System.out.println("Your grade is good.");
                break;
            case 'D':
                System.out.println("Your grade is low. You have to take the course again.");
                break;
            case 'E':
                System.out.println("Your grade is very low. You have to take the course again.");
                break;
            default:
                System.out.println("Not a valid grade");
        }
    }
}
