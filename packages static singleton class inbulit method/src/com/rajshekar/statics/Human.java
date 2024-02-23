package com.rajshekar.statics;

public class Human {
    int age;
    String name;
    long salary;
    boolean marriedStatus;
//    static variable
    static long population;
    static void message(){
        System.out.println("hello world");
    }

    public  Human (int age,String name, long salary, boolean marriedStatus) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.marriedStatus = marriedStatus;
        Human.population += 1;
        Human.message();
    }

}
