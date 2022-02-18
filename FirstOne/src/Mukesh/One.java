package Mukesh;

import java.util.stream.Stream;

import static java.lang.System.out;

public class One {
    public static void main(String[] args) {
        out.println("Hello hello");
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
        stream.forEach(p -> System.out.print(p));
    }

}
