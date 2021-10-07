package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("What is your name?");
      String name = in.nextLine();
      System.out.println("Where do you live," + name + "?");
      String address = in.nextLine();
      System.out.printf("Your name is:%s, You live in:%s", name, address);
    }
}
