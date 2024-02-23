package com.rajshekar.Polymorphism;

public class ObjectPrint {
    int num ;
    public ObjectPrint(int num)
    {

      this.num = num;
    }

    public static void main(String[] args) {
        System.out.println("hello world !");
    ObjectPrint obj =  new ObjectPrint(34);
        System.out.println(obj);

    }
}


// finale keyword is used to prevent from method overiding and inheritance and it can not re assign to variable