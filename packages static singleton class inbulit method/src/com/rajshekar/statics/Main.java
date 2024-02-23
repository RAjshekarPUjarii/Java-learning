package com.rajshekar.statics;

import java.util.logging.Handler;

public class Main {
    public static void main(String[] args) {
        Human raj = new Human(20,"rajshekar pujari " ,10000,false);
        Human shiv = new Human(20,"shivling pujari " ,20000,false);
        Human rachesh = new Human(20,"rachesh patil " ,20000,false);
//        System.out.println(raj.population);
//        System.out.println(shiv.population);
//        System.out.println(rachesh.population);

//        above code it works but conventional we should use below code

        System.out.println(Human.population);
        System.out.println(Human.population);
        System.out.println(Human.population);
        greeting();
    }

//    static method
    static void greeting(){
        System.out.println("hello ");
    }

}
