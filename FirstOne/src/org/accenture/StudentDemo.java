package org.accenture;

public class StudentDemo {
    private int studentId;
    private String studentName;
    private String department;
    private Address a;
    private College c;

    public StudentDemo(int studentId, String studentName, String department, Address a, College c) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.department = department;
        this.a = a;
        this.c = c;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Address getA() {
        return a;
    }

    public void setA(Address a) {
        this.a = a;
    }

    public College getC() {
        return c;
    }

    public void setC(College c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", department='" + department + '\'' +
                ", a=" + a +
                ", c=" + c +
                '}';
    }
}
