package com.rajshekar.Abstraction;

public abstract class Parent {
    int num;

    public Parent(int num) {
        this.num = num;
    }

    // we can create static variable or methods in abstract class
    static void hello(){
        System.out.println("hello bloody sweet");
    }
// we can also create a normal function
void normal(){
    System.out.println("this is a normal function");
}


    abstract  void career();
    abstract  void patner();
}
