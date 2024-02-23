package com.rajshekar.SingletonClass;

import org.w3c.dom.ls.LSOutput;

public class SingletonClass {

     private int num =34;  // it is private variable it cannot access outside  a class
     private SingletonClass(){

    }


    private  static SingletonClass instance;

     public  static  SingletonClass getInstance(){
//         check whether onl one object is created or not
         if(instance == null){
             instance = new SingletonClass();
             System.out.println();
         }
         return instance;
     }


}
