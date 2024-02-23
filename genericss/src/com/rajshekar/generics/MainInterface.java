package com.rajshekar.generics;

public class MainInterface<O> implements genericInterface<Object>{  // type can be Number or Object
    @Override
    public void display(Object value) {

        System.out.println("this is know as Integer value" + value);
    }

    public static void main(String[] args) {
        MainInterface<Integer> obj = new MainInterface<>();
        obj.display("Rajshekar pujari");

    }
}
