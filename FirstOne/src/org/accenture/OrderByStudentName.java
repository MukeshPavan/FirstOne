package org.accenture;

import java.util.Comparator;

public class OrderByStudentName implements Comparator<StudentDemo> {
    public int compare(StudentDemo s1, StudentDemo s2) {
        return s1.getStudentName().compareTo(s2.getStudentName());
    }
}
