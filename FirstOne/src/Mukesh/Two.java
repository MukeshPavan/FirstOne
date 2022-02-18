package Mukesh;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Two {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("one");
        names.add("three");
        names.add("twenty");
        names.add("fourtyfive");
        names.add("four");
        names.add("onecrorecrore");
        int x = 0;
        for (String s : names) {
            if (s.length() < 5) x++;
        }
        System.out.println(x+" strings with length less than 5");
        System.out.println("**********************");
        long count = names.stream().filter(str->str.length()<5).count();
        System.out.println(count+" strings with length less than 5");

        //Creating Stream using Stream.of
        Stream<String> name = Stream.of("one","twentyfive","Infinity");
        name.forEach(System.out::println);

        System.out.println("*********************");
        //Creating stream using array of elements
        Stream<Integer> intStream1 = Stream.of(new Integer[]{1,2,3,4,5});
        intStream1.forEach(System.out::print);
    }
}
