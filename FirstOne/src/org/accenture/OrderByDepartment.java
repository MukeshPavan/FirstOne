package org.accenture;

import java.util.Comparator;

public class OrderByDepartment implements Comparator<StudentDemo> {
    public int compare(StudentDemo s1,StudentDemo s2){
        return s1.getDepartment().compareTo(s2.getDepartment());
    }

}
