package com.rajshekar.generics;

public class testGeneric {
    public static void main(String[] args) {
        myGen<Integer> list = new myGen<>();
        list.add(34);
//        obj.add("rajs");  Provide only Integer type not others type
        System.out.println(list);
    }
}
