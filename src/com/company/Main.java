package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int rez = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("input a");
        int a = in.nextInt();
        System.out.println("Input b");
        int b = in.nextInt();
        System.out.printf("rez = %d, %d, %d, %d,\n", a+b, a-b, a*b, a/b);
    }
}
