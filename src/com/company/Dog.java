package com.company;

public class Dog implements Animal{
    String[] animals = new String[]{"Bobik", "Shurik"};
    @Override
    public void voice() {
        System.out.println("гав");
    }

    @Override
    public void feed() {
        System.out.println("mmm");
    }
}
