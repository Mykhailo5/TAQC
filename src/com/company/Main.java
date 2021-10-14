package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<String, String>();
        personMap.put("Ivanov", "Oleg");
        personMap.put("Petrov", "Mykola");
        personMap.put("Mykhailyshyn", "Mykhailo");
        personMap.put("Vasylyshyn", "Yaroslav");
        personMap.put("Merza", "Maria");
        personMap.put("Levitskiy", "Oleg");
        personMap.put("Pelenskiy", "Arthur");
        personMap.put("Popovych", "Mykhailo");
        personMap.put("Seniuta", "Denys");
        personMap.put("Palyvoda", "Maryana");

        /*personMap.put("Igor", "Ivanov");
        personMap.put("Mykola", "Petrov");
        personMap.put("Mykhailo", "Mykhailyshyn");
        personMap.put("Yaroslav", "Vasylyshyn");
        personMap.put("Maria", "Merza");
        personMap.put("Oleg", "Levitskiy");
        personMap.put("Arthur", "Pelenskiy");
        personMap.put("Mykhailo", "Popovych");
        personMap.put("Denys", "Seniuta");
        personMap.put("Maryana", "Palyvoda");*/

        //to find by value
        System.out.println("personMap before removal: " + personMap);
        personMap.values().removeIf(value -> value == "Mykhailo");
        System.out.println("personMap after removal: " + personMap);

        //to find by key
      /* for(Iterator<String> iterator = personMap.keySet().iterator(); iterator.hasNext(); ) {
            String key = iterator.next();
            if(key == "Mykhailo") {
                iterator.remove();
            }
        }
        System.out.println(personMap);*/

        //also to find by key in Java 8+
        /*personMap.keySet().removeIf(key -> key == "Mykhailo");
            System.out.println(personMap);
        }*/

    }
}

