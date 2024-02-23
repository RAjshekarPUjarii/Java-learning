package com.rajshekar.generics.comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student rajshekar = new Student(4,56.f);
        Student shiv = new Student(5,96.f);
        Student rachesh = new Student(5,90.f);
        Student prajwal = new Student(6,93.f);
        Student sachin = new Student(7,89.f);
        Student rohit = new Student(8,60.f);

        Student[] list = {rajshekar,shiv , rachesh, prajwal, sachin, rohit};
//        System.out.println(Arrays.toString(list));

//        to sort array
//        Arrays.sort(list);
//        System.out.println(Arrays.toString(list));

//        or

//        Arrays.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                // in increasing order
//                return -(int) (o1.marks - o2.marks);
////                 in decreasing ordr
////                return -(int) (o1.marks - o2.marks);
//            }
//        });
        System.out.println(Arrays.toString(list));

//        lamda expression
        Arrays.sort(list,((o1, o2) -> (int) (o1.marks - o2.marks)));
        System.out.println(Arrays.toString(list));


//            older way to comparing two object
//        if(rajshekar.compareTo(shiv)<0){
//            System.out.println(rajshekar.compareTo(shiv));
//            System.out.println("rajshekar has more marks");
//        }
    }
}
