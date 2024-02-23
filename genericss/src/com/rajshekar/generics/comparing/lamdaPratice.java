package com.rajshekar.generics.comparing;
// annotation
@FunctionalInterface  // means having only one abstract method
interface  lamdaInterface{
//    void show();
    int  show(int a , int b);
}

//public class lamdaPratice{
//    public static void main(String[] args) {
//        lamdaInterface obj = new lamdaInterface(){
////            @Override
//            public void show(){
//                System.out.println("this is a show method");
//            }
//        };
//
//        obj.show();
//    }
//}
// to reduce above code use below code

public class lamdaPratice{
    public static void main(String[] args) {
//        this is know as lamda expression
//         with no parameter
//        lamdaInterface obj = ()-> System.out.println("this is a show method");
//        obj.show();

//        with one or two parameter
//        lamdaInterface obj = new lamdaInterface() {
//            @Override
//            public void show(int a , int b ) {
//                System.out.println("hi this is show method"+ a + " " + b);
//            }
//        };

//        lamdaInterface obj =(int a , int b)-> return  a + b;  like this is not allowed return type
        lamdaInterface obj =(int a , int b)-> a + b;
        int result =  obj.show(4,4);
        System.out.println(result);


//
//
    }
}