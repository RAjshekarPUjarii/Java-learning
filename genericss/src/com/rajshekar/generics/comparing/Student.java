package com.rajshekar.generics.comparing;

public class Student implements Comparable<Student>{
    int roll;
    float marks;

    public Student(int roll, float marks) {
        this.roll = roll;
        this.marks = marks;
    }

    @Override
//    public String toString() {
//        return "Student{" +
//                "roll=" + roll +
//                ", marks=" + marks +
//                '}';
//    }
      public String toString() {
        return marks + "";
    }

    @Override
    public int compareTo(Student o) {
//        System.out.println("answer :" + o);
        int diff = (int)(this.marks - o.marks);
        return diff;
    }
}
