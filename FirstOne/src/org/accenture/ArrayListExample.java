package org.accenture;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        System.out.println(cars.get(2));
        System.out.println(cars.set(0,"Ferari")+" "+cars.get(0));
        System.out.println(cars);
        cars.remove(3);
        System.out.println(cars);
        System.out.println(cars.size());
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        for (String i: cars) {
            System.out.println(i);
        }
        ArrayList<Integer> num=new ArrayList<Integer>();
        num.add(5);
        num.add(342);
        num.add(123);
        num.add(987);
        for (Integer i: num) {
            System.out.println(i);
        }
        Collections.sort(cars);
        Collections.sort(num);
        System.out.println(cars+"\n"+num);
    }
}
