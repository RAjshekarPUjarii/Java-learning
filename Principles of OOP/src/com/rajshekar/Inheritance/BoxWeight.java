package com.rajshekar.Inheritance;
// single Inheritance
public class BoxWeight extends Box {
    double weight;
    BoxWeight(){
        this.weight = -1;
    }

    BoxWeight(double l , double h , double w , double weight){
//        super 1 case : we can call a parent constructor to access a varible
        super(l,h,w);
        this.weight = weight;
//        super 2 case: we can access a variable of parent classs
        System.out.println( " super " + super.h);   // it also like this.h
        System.out.println( " this " + this.h);
        // above super.h and this.h is same accesing varible of h  of parent class but
//        when we have same variable both parent and child class ,suppose we want access parent variable
//         if we use this.h then it will give from child but we want form parent class so that we super
//        keyword is used  to access a parent property(like variable , method etc)
        super.information();

    }

    BoxWeight(double side , double weight){
        super(side);
        this.weight = weight;
    }

    BoxWeight(double l , double h ,double w , double side ,double weight){
        super(l,h ,w ,side);
        this.weight = weight;
    }

}
