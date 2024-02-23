package com.rajshekar.Polymorphism;

// types of polymorphism
//    1: compile time or static polymorphism  -> it achieve by method overloading
//    2: runtime or dynamic polymorhism -> it achieve  by method overriding

public class Main {
    public static void main(String[] args) {
   Shapes shapes = new Shapes();
   Circle circle = new Circle();
   Square square = new Square();
   Triangle triangle = new Triangle();
   shapes.area();
   circle.area();
   square.area();
   triangle.area();
    }
}
