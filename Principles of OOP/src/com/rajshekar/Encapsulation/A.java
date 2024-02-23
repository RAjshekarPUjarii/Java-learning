package com.rajshekar.Encapsulation;

public class A {
protected int num;
    private String name;


//
//    public int getNum() {
//        return num;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setNum(int num) {
//        this.num = num;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }


    int[] arr;
    public  A(int num , String name ){
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }

}
