package com.rajshekar.Inheritance;

public class Main {
    public static void main(String args[]){
//         parent class constructor  or constructor overloading
//          Box obj1= new Box();
////        Box obj2 = new Box(4.4);
////        Box obj3 = new Box(2.3,4.4,5.5);
////        Box obj4 = new Box(obj3);
////        System.out.println(obj1.l + " " + obj1.h + " " + obj1.w);
////        System.out.println(obj2.l + " " + obj2.h + " " + obj2.w);
////        System.out.println(obj3.l + " " + obj3.h + " " + obj3.w);
////        System.out.println(obj4.l + " " + obj4.h + " " + obj4.w);

        // child class constructor
//        BoxWeight obj1= new BoxWeight(2,3,4,5);
//        BoxWeight obj2= new BoxWeight(2);
//        System.out.println(obj1.l + " " + obj1.h + " " + obj1.w + " " + obj1.weight);
//        System.out.println(obj2.l + " " + obj2.h + " " + obj2.w);

        // parent class obj as reference variable
//        Box obj1 = new BoxWeight(2,3,4,5);
//        Box obj2 = new BoxWeight(4,5);
        // we can access only parent property not child property when parent obj is  refering to child class
//        but vice verso is not allowed
//        System.out.println(obj1.l + " " + obj1.h + " " + obj1.w );




//    MultiLevel Inheritance
//        BoxPrice obj1= new BoxPrice();
//        BoxPrice obj2 = new BoxPrice(1,2,3);
        BoxPrice obj3= new BoxPrice(1,2,3 ,4 ,5,45);
//        System.out.println(obj3.l + " " + obj3.h + " " + obj3.w + " " + obj3.weight + " " + obj3.cost);


//   Heirichial Inheritance

        BoxColor obj = new BoxColor(1,2,3,4) ;
        System.out.println(obj.l + " " + obj.h + " " + obj.w + " " + obj.color);



    }
}
