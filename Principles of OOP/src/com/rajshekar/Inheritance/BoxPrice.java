package com.rajshekar.Inheritance;

// multiLevel Inherintance


public class BoxPrice  extends  BoxWeight{
    double cost;
    BoxPrice(){
        this.cost = -1;
    }

    BoxPrice(double side , double weight , double cost){
        super(side , weight);
        this.cost = cost;
    }
    BoxPrice(double l , double h , double w , double side , double weight , double cost){
        super(l ,h, w , side ,weight);
        this.cost = cost;
    }
}

// defn one class extending more than one class is called as multiple  inheritance
// Multiple Inheritance is not suppoted in java because
// when two or more parent class have with same variable name then the child class will confused which
// should i pick ??? that's why multiple inheritance is not suppoted in java but we can do in interfaces
