package com.rajshekar.SingletonClass;

public class Main {
    public static void main(String[] args) {
        SingletonClass obj1 = SingletonClass.getInstance();

        SingletonClass obj2 = SingletonClass.getInstance();

        SingletonClass obj3= SingletonClass.getInstance();

//           all three refrence variable are pointing to just one object
//        thats all.....


    }
}
