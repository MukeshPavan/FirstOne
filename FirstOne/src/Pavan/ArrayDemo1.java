package Pavan;
//
////public class ArrayDemo1 {
////        public static void main(String args[]){
////            String []b={"Apple","Mango","Orange"};
////            System.out.println("Before Function Call    "+b[0]);
////            ArrayDemo1.passByReference(b);
////            System.out.println("After Function Call    "+b[0]);
////        }
////
////    public static void passByReference(String a[]) {
////        a[0] = "Changed";
////    }
////}
//
//class ObjectArray{
//    public static void main(String args[]){
//        Account obj[] = new Account[2] ;
//        obj[0] = new Account();
//        obj[1] = new Account();
//        obj[0].setData(1,2);
//        obj[1].setData(3,4);
//        System.out.println("For Array Element 0");
//        obj[0].showData();
//        System.out.println("For Array Element 1");
//        obj[1].showData();
//    }
//}
//class Account {
//    int a;
//    int b;
//
//    public void setData(int c, int d) {
//        a = c;
//        b = d;
//    }
//
//    public void showData() {
//        System.out.println("Value of a =" + a);
//        System.out.println("Value of b =" + b);
//    }
//}

import java.util.ArrayList;
class Test_ArrayList {
    public static void main(String[] args) {
        //Creating a generic ArrayList
        ArrayList<String> arlTest = new ArrayList<String>();
        //Size of arrayList
        System.out.println("Size of ArrayList at creation: " + arlTest.size());
        //Lets add some elements to it
        arlTest.add("D");
        arlTest.add("U");
        arlTest.add("K");
        arlTest.add("E");

        //Recheck the size after adding elements
        System.out.println("Size of ArrayList after adding elements: " + arlTest.size());

        //Display all contents of ArrayList
        System.out.println("List of all elements: " + arlTest);

        //Remove some elements from the list
        arlTest.remove("D");
        System.out.println("See contents after removing one element: " + arlTest);

        //Remove element by index
        arlTest.remove(2);
        System.out.println("See contents after removing element by index: " + arlTest);

        //Check size after removing elements
        System.out.println("Size of arrayList after removing elements: " + arlTest.size());
        System.out.println("List of all elements after removing elements: " + arlTest);

        //Check if the list contains "K"
        System.out.println(arlTest.contains("K"));
        
    }
}