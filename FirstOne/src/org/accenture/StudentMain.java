package org.accenture;
import java.util.ArrayList;
import java.util.Scanner;
public class StudentMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<StudentDemo> ar= new ArrayList<>();
        for (int i = 0; i <3 ; i++) {
            System.out.println("Enter Id");
            int studentId= sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Name");
            String studentName= sc.nextLine();
            System.out.println("Enter Department");
            String department=sc.nextLine();
            System.out.println("Enter address1");
            String a1= sc.nextLine();
            System.out.println("Enter address2");
            String a2= sc.nextLine();
            System.out.println("Enter college id");
            int cid= sc.nextInt();
            sc.nextLine();
            System.out.println("Enter college name");
            String cname = sc.nextLine();
            System.out.println("Enter university");
            String university = sc.nextLine();
            Address a=new Address(a1,a2);
            College c=new College(cid,cname,university);
            ar.add(new StudentDemo(studentId,studentName,department,a,c));
        }
        System.out.println("Printing the given data");
        ar.forEach(System.out::println);
        System.out.println("""
                1.Ordered by name
                2.Ordered by department
                3.Ordered by CollegeName""");
        int s=sc.nextInt();
        if(s==1) {
            ar.sort(new OrderByStudentName());
            ar.forEach(System.out::println);
        }
        else if(s==2){
            System.out.println();
            ar.sort(new OrderByDepartment());
            ar.forEach(System.out::println);
        }
        else if (s==3){
            System.out.println();
            ar.sort(new OrderByCollegeName());
            ar.forEach(System.out::println);
        }
    }
}
