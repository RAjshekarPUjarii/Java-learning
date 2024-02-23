package com.rajshekar.generics.cloning;

public class Main {
    public static void main(String[] args)throws CloneNotSupportedException {
        Human rajshekar = new Human(45, "rajshekar pujari");
//        Human twinOfMy = new Human(rajshekar);
//        System.out.println(rajshekar);
//        System.out.println(twinOfMy);

       Human twin = (Human) rajshekar.clone();
        System.out.println(twin.age + " " + twin.name );
    }
}
