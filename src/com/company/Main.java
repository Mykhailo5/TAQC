package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> collection = new ArrayList<Integer>(10);
        collection.add(1);
        collection.add(10);
        collection.add(3);
        collection.add(15);
        collection.add(5);
        collection.add(27);
        collection.add(6);
        collection.add(29);
        collection.add(9);
        collection.add(45);

        List<Integer> newCollection = new ArrayList<Integer>();
        newCollection.add(1);
        newCollection.add(2);
        newCollection.add(3);
        newCollection.add(4);
        newCollection.add(5);
        newCollection.add(6);
        newCollection.add(7);
        newCollection.add(8);
        newCollection.add(9);
        newCollection.add(10);
        for (int i = 5; i < newCollection.size(); i++) {
            System.out.println(newCollection.get(i));
        }
        System.out.println("-----------------------");
        for (int i = 0; i < collection.size(); i++){
            if (collection.get(i) > 20)
                collection.remove(i);
        }
        System.out.println("elements in collection which are greater than 20 are removed : " + collection);
        System.out.println("-----------------------");

            newCollection.add(2,1);
            newCollection.add(8,-3);
            newCollection.add(5,-4);
            System.out.println(newCollection);

    }
}
