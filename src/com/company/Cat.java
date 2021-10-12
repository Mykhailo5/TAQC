package com.company;

public class Cat implements Animal {
    String[] animals = new String[]{"Sonya", "Murka"};
    @Override
    public void voice() {
        System.out.println("гав");
    }

    @Override
    public void feed() {
        System.out.println("mmm");
    }
}
