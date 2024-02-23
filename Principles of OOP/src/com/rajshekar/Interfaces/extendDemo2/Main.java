package com.rajshekar.Interfaces.extendDemo2;

public class Main implements A , B{
//    we can declare a static block before a or after a Main method

//    static {
//        System.out.println("this is static block in Main method");
//    }
    public static void main(String[] args) {
    Main a = new Main();
    a.greet();
    a.hello();
    A.raj();

}
//    static {
//        System.out.println("this is static block in Main method");
//    }

    @Override
    public void greet() {
        B.super.greet();
    }

    @Override
    public void hello() {
        A.super.hello();
    }
}
