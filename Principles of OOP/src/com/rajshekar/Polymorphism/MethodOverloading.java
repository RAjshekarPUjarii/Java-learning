package com.rajshekar.Polymorphism;

public class MethodOverloading {
    void sum (){
        System.out.println("no parameter");
    }

    int sum(int a , int b ){
        return  a + b;
    }

    int sum(int a, int b , int c){
        return a + b + c;
    }

    public static void main(String[] args) {
        MethodOverloading obj  =  new MethodOverloading();
        obj.sum();
        System.out.println(obj.sum(2,3));
        System.out.println(obj.sum(4,4,5));
    }

}
