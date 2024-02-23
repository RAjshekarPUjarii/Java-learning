package com.rajshekar.Inheritance;


// heirachial Inheritance
//defin : one class inherites many classs like
// BoxColor and BoxWeight is extending  with same class of Box class
public class BoxColor extends Box {

    double color;
//    BoxColor(){
//        this.color = -1;
//    }
    BoxColor(double l , double h, double w , double color){
        super(l , h , w);
        this.color = color;
    }
}
