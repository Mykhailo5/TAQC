package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println(squareRectangle(5,-9));
    }
    public static int squareRectangle (int width, int height) throws Exception {
        if(width<0 || height<0) throw new Exception("Number is less than 0");
        return (width * height);
    }
}
