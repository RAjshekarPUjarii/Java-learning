package com.rajshekar.generics;

public class myGen <T>{
    T obj ;
    void add(T obj){
        this.obj = obj;
    }
    T get(){
      return  obj;
    }
}

