package org.accenture;

import java.util.Comparator;

public class OrderByCollegeName implements Comparator<StudentDemo> {
    public int compare(StudentDemo s1,StudentDemo s2){
        return s1.getC().getCname().compareTo(s2.getC().getCname());
    }

}
