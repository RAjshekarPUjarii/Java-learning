package com.rajshekar.Polymorphism;


 class A{
   void  method(){
        System.out.println("this is method of A");

    }
}
class B extends A{
   void  method (){
        System.out.println("this is method of B");

    }
}

class  DynamicMethodDispatch{
    public static void main(String[] args) {
        A a = new A();
//        a.method();
        B b = new B();
//        b.method();
        A ref;
        ref = b;
        ref.method();
    }
}

