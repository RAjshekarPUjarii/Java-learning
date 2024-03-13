package com.rajshekar.Encapsulation;

public class Main {
    public static void main(String[] args) {

        A obj = new A(10  ,"rajshekar");

//    getter function access a private data member as show below

      System.out.println(obj.getName());
        System.out.println(obj.getNum());   
        //setter function  to set a private data member as shown below
      obj.setNum(3); 
        obj.setName("shivling");
     System.out.println(obj.getName());
    System.out.println(obj.getNum());

        System.out.println(obj.num);


}

}
