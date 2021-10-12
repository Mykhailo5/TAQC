package com.company;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Student bob = new Student("Student");
        bob.print();
        Teacher sam = new Teacher("Teacher");
        sam.print();
        sam.salary();
        Cleaner den = new Cleaner("Cleaner");
        den.print();
        den.salary();
    }
}
