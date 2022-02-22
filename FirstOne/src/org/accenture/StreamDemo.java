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
        System.out.println(i); // Printing set of integers
        List<Integer> i2 = i.stream().filter(x->x%2!=0).collect(Collectors.toList());
        System.out.println(i2); // Printing Set of odd numbers from given set of integers
        /* In a class(in school) some example scenarios*/
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(53);
        marks.add(30);
        marks.add(45);
        marks.add(90);
        marks.add(33);
        marks.add(74);
        marks.add(63);
        System.out.println(marks);// Printing students marks
        long noOFailedStudents = marks.stream().filter(x->x<36).count();// used to filter the marks of students
        System.out.println("no of failed students are: "+noOFailedStudents);// Printing the no of failed students
        List<Integer> updatedMarks = marks.stream().map(x->x+6).collect(Collectors.toList()); // Teacher used to update the marks of students by adding grace marks.
        System.out.println(updatedMarks); // Printing Updated students marks
        long noOFFailedStudents = updatedMarks.stream().filter(x->x<36).count(); //again counting if any failed students smissed
        System.out.println("no of failed students after adding grace marks are: "+noOFFailedStudents); //No one is there all are passed
        List<Integer> sortedMarks = marks.stream().sorted().collect(Collectors.toList()); //sorting the marks (ascending order)
        System.out.println(sortedMarks); //used to print sorted marks
        List<Integer> descSortedMarks =sortedMarks.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());//sorting the marks (descending order)
        System.out.println(descSortedMarks); //used to print sorted marks
        Integer minValue = descSortedMarks.stream().min(Comparator.naturalOrder()).get(); // finding minimum marks of student
        System.out.println(minValue);//printing the minimum value
        Integer maxValue=descSortedMarks.stream().max(Comparator.naturalOrder()).get();// finding maximum marks of student
        System.out.println(maxValue);//printing the maximum value
        /*  using strings some example scenarios*/
        ArrayList<String> y = new ArrayList<>();
        y.add("dog");
        y.add("frog");
        y.add("cat");
        y.add("buffalo");
        y.add("lion");
        y.add("cheetah");
        System.out.println(y); //Printing set of words
        List<String> sortedAnimals = y.stream().sorted().collect(Collectors.toList());//sorting the animals(ascending order)
        System.out.println(sortedAnimals);//Printing sorted values
        List<String> descSortedAnimals = y.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());//sorting the animals(descending order)
        System.out.println(descSortedAnimals);//Printing sorted values
        extracted(y);
        System.out.println("________________________");
    }

    private static void extracted(ArrayList<String> y) {
        Comparator<String> c = (s1,s2)->{
            if (s1.length()<s2.length())
                return -1;
            else if (s1.length()>s2.length())
                return 1;
            else
                return s1.compareTo(s2);
        };//method to sort based on length
        List<String> sortedAnimalsBasedOnLength = y.stream().sorted(c).collect(Collectors.toList());//collecting the sorted animals based on length
        System.out.println(sortedAnimalsBasedOnLength);//printing the sorted animals
    }

}
