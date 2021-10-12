package com.company;

public class Cleaner extends Staff {
    final String TYPE_PERSON;
    String name = "Den";

    public Cleaner(String type_person) {
        TYPE_PERSON = type_person;
    }

    @Override
    public void salary() {
        System.out.println("My salary is 6800");
    }

    @Override
    public void print() {
        System.out.println("I am a cleaner "+ name);
    }
}
