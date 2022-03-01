package org.accenture;
import java.util.ArrayList;
import java.util.Scanner;
public class StudentMain {//main class of student
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<StudentDemo> ar= new ArrayList<>();//creating arraylist
        for (int i = 0; i <10 ; i++) {   //List of ten students data
            System.out.println("Enter Id");
            int studentId= sc.nextInt();//reads the input student id from user
            sc.nextLine();
            System.out.println("Enter Name");
            String studentName= sc.nextLine();//reads the input Student name from user
            System.out.println("Enter Department");
            String department=sc.nextLine();//reads the input department of corresponding Student
            System.out.println("Enter address(H.no, Street)");
            String a1= sc.nextLine();//reads the address of corresponding Student
            System.out.println("Enter address(State, Pincode)");
            String a2= sc.nextLine();//reads the address of corresponding Student
            System.out.println("Enter college id");
            int cid= sc.nextInt();//reads the college id of corresponding Student
            sc.nextLine();
            System.out.println("Enter college name");
            String cname = sc.nextLine();//reads the college id of corresponding Student
            System.out.println("Enter university");
            String university = sc.nextLine();//reads the university of corresponding Student
            Address a=new Address(a1,a2);//address object creation
            College c=new College(cid,cname,university);//college object creation
            ar.add(new StudentDemo(studentId,studentName,department,a,c));//creation of student object and add the corresponding student into array
        }
        System.out.println("Printing the given data");
        ar.forEach(System.out::println);//Prints the input of ten students
        System.out.println("1.Ordered by name \n2.Ordered by department \n3.Ordered by CollegeName");
        int s=sc.nextInt();//reads input based on requirement
        if(s==1) {
            ar.sort(new OrderByStudentName());//sorting based on Student name.
            ar.forEach(System.out::println);
        }
        else if(s==2){
            System.out.println();
            ar.sort(new OrderByDepartment());//sorting based on Department.
            ar.forEach(System.out::println);
        }
        else if (s==3){
            System.out.println();
            ar.sort(new OrderByCollegeName());//sorting based on College name.
            ar.forEach(System.out::println);
        }
    }
}
