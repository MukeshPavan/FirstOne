package org.accenture;

public class ArrayAvgExample {
    public static void main(String[] args) {
        double n[] = new double[]{2,3,-5,-57,1000,47};
        double sum = 0;
        for(int i=0; i < n.length ; i++)
            sum = sum + n[i];
        double average = sum / n.length;
        System.out.println("Average value of the array elements is : " + average);
    }
}

class FindingIndex {
    public static int  findIndex (int[] my_array, int t) {
        if (my_array == null) return -1;
        int len = my_array.length;
        int i = 0;
        while (i < len) {
            if (my_array[i] == t) return i;
            else i=i+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        System.out.println("Index position of 25 is: " + findIndex(my_array, 25));
        System.out.println("Index position of 77 is: " + findIndex(my_array, 77));
    }
}
