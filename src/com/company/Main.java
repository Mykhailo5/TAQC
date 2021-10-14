package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x = 3;
        int y = 56;
        int z = x + y;
        int t = x - y;
        int r = x * y;
        int pos;
        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append(x).append("+").append(y).append("=").append(z).append("\n");
        strBuilder.append(x).append("-").append(y).append("=").append(t).append("\n");
        strBuilder.append(x).append("*").append(y).append("=").append(r).append("\n");
        System.out.println(strBuilder);
        System.out.println("----------------");

        while ((pos = strBuilder.indexOf("=")) != -1) {
            strBuilder.deleteCharAt(pos);
            strBuilder.insert(pos, " дорівнює ");
        }
        System.out.println(strBuilder);
        System.out.println("----------------");


        /*String value = strBuilder.toString().replace("=", " equals ");
        System.out.println(value);*/
    }
}


