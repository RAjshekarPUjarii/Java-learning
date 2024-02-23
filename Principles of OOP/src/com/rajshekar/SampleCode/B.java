package com.rajshekar.SampleCode;

import com.rajshekar.AccessModifier.A;

public class B extends A {
    public B(int num) {
        super(num);
    }

    public static void main(String[] args) {
        B o = new B(23);
        System.out.println(o.num);
    }
}
