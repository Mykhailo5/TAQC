package com.company;

public class Student extends Person {
    final String TYPE_PERSON;
    String name = "Bob";

    public Student(String type_person) {
        TYPE_PERSON = type_person;
    }

    @Override
    public void print() {
        System.out.println("I am a Student " + name);
    }
}
