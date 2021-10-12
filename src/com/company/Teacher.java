package com.company;

public class Teacher extends Staff {
    final String TYPE_PERSON;
     String name = "Sam";

    public Teacher(String type_person) {
        TYPE_PERSON = type_person;
    }

    @Override
    public void salary() {
        System.out.println("My salary is 10500");
    }

    @Override
    public void print() {
        System.out.println("I am a teacher " + name);
    }
}
