package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How are you?");
        String answer = in.nextLine();
        System.out.println("You are "+ answer);
    }
}
