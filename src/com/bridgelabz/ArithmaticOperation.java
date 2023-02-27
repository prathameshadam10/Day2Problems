package com.bridgelabz;

import java.util.Scanner;

public class ArithmaticOperation {
    public static void main(String[] args) {
    int a;
    int b;
    int c;
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a :");
    a = sc.nextInt();
        System.out.println("Enter the value of b :");
    b = sc.nextInt();
        System.out.println("Enter the value of c :");
    c = sc.nextInt();

        int operation1;
        int operation2;
        int operation3;
        int operation4;
        operation1 = a + b * c;
        operation2 = c + a / b;
        operation3 = a % b + c;
        operation4 = a * b + c;

        System.out.println(operation1);
        System.out.println(operation2);
        System.out.println(operation3);
        System.out.println(operation4);



    }
}
