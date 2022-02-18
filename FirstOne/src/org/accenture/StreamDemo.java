package org.accenture;

import java.util.*;
import java.util.stream.Collectors;


@SuppressWarnings("ALL")
public class StreamDemo {
    public static void main(String[] args) {
        System.out.println("Programs on streams");
        ArrayList<Integer> i = new ArrayList<>();
        i.add(2);
        i.add(3);
        i.add(5);
        i.add(10);
        i.add(22);
        i.add(246);
        System.out.println(i); //Printing set of integers
        List<Integer> i2 = i.stream().filter(x->x%2!=0).collect(Collectors.toList());
        System.out.println(i2); //Set of odd numbers from given set of integers
        System.out.println("----------------------");
        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(53);
        marks.add(30);
        marks.add(45);
        marks.add(90);
        marks.add(33);
        marks.add(74);
        marks.add(63);
        System.out.println(marks);//Printing students marks
        long noOFailedStudents = marks.stream().filter(x->x<36).count();
        System.out.println("no of failed students are: "+noOFailedStudents);
        List<Integer> updatedMarks = marks.stream().map(x->x+6).collect(Collectors.toList());
        System.out.println(updatedMarks);
        System.out.println("----------------------");
        long noOFFailedStudents = updatedMarks.stream().filter(x->x<36).count();
        System.out.println("no of failed students after adding grace marks are: "+noOFFailedStudents);
        List<Integer> sortedMarks = marks.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedMarks);
        List<Integer> descSortedMarks =sortedMarks.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(descSortedMarks);
        System.out.println("----------------------");
        Integer minValue = descSortedMarks.stream().min(Comparator.naturalOrder()).get();
        System.out.println(minValue);
        Integer maxValue=descSortedMarks.stream().max(Comparator.naturalOrder()).get();
        System.out.println(maxValue);
        System.out.println("---------------$$$$$$$$$$$$$4445365ew6wtyety-------");
        //________________________________________
        //****************************************
        ArrayList<String> y = new ArrayList<>();
        y.add("dog");
        y.add("frog");
        y.add("cat");
        y.add("buffalo");
        y.add("lion");
        y.add("cheetah");
        System.out.println(y); //Printing set of words
        List<String> sortedAnimals = y.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedAnimals);
        List<String> descSortedAnimals = y.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(descSortedAnimals);
        System.out.println("----------------------");
        //-------------------------------------------------------
        //________________________________________________________________________
        //*************************************************************************
        Comparator<String> c = (s1,s2)->{
            if (s1.length()<s2.length())
                return -1;
            else if (s1.length()>s2.length())
                return 1;
            else
                return s1.compareTo(s2);
        };
        List<String> sortedAnimalsBasedOnLength = y.stream().sorted(c).collect(Collectors.toList());
        System.out.println(sortedAnimalsBasedOnLength);
    }
}