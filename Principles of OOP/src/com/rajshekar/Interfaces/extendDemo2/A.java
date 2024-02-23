package com.rajshekar.Interfaces.extendDemo2;
// this is know as default abstract implementation
public interface A {
//    static interfaces method always must have a body as shown below
    static void raj(){
        System.out.println("this is a know as static method in interfaces");

    }

    default void hello(){
        System.out.println("I am in A interfaces as default ");
    }

}
