package com.rajshekar.SampleCode;

import com.rajshekar.Encapsulation.A;
public class Subclass extends A {
    public Subclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
       Subclass obj = new Subclass(546 , "rachesh");
        System.out.println(obj.num);
    }
}
