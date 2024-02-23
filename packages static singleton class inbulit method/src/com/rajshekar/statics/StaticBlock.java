package com.rajshekar.statics;

public class StaticBlock {
    // static  variable of a instance class
    static int a =4;
    static int b;

    // static block only once it will execute when a class is loaded
    static {
        System.out.println("i am static block and i will execute only once when class is loaded");
        b = a*5;
    }

    // i can create main method inside a classes
    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a  + " " + StaticBlock.b);

        StaticBlock.a +=4;
        System.out.println(StaticBlock.a  + " " + StaticBlock.b);

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a  + " " + StaticBlock.b);
    }

}
