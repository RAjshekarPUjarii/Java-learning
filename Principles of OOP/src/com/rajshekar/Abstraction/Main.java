package com.rajshekar.Abstraction;

public class Main {
    public static void main(String[] args) {
        Son obj = new Son(23);
        obj.patner();
        obj.career();
        Parent.hello();
        obj.normal();
        System.out.println(obj.num);

        }
}
