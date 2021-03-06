package org.accenture;

public class ArrayExample {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[0]);
        cars[0] = "Ferari";
        System.out.println("After modifying lower index value");
        System.out.println(cars[0]);
        System.out.println("To Know the size/length of an array");
        System.out.println(cars.length);
        System.out.println("Using loop printing all the array values");
        for (int i = 0; i < cars.length; i++) {
            System.out.println(i + "=" + cars[i] + " ");
        }
        for (String i : cars) {
            System.out.println(i);
        }
        //Two dimensional array
        int[][] myNumbers = {{1, 3, 5, 7}, {2, 4, 6}, {2, 3, 5, 7}};
        int x = myNumbers[2][2];
        System.out.println(x);
        for (int[] myNumber : myNumbers) {
            for (int i : myNumber) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
