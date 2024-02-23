package com.rajshekar.generics;

import java.util.ArrayList;
import java.util.Arrays;
// to copy any file , point on which you want to copy then press ctr +  v
public class customArrayList {

       private int[] data;
       private static  int  DEFAULT_SIZE = 10;
       int size =0;

    public customArrayList() {
        this.data =  new int[DEFAULT_SIZE];
    }
    public void add(int value){
        if(isFull()){
            reSize();
        }
        data[size++] =value;
    }
 public void reSize(){
        int[] temp = new int[data.length * 2];
     for (int i = 0; i <data.length ; i++) {
            temp[i] = data[i];
     }
     data = temp;
 }
  public int remove(){
        int removed  = data[--size];
        return removed;
  }
  public int size(){
        return  size;
  }
  public int get(int index){
        return data[index];
  }

  public void set(int index , int value){
        data[index] = value;
  }

    @Override
    public String toString() {
        return "customArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public Boolean isFull(){
        return  size == data.length;
    }

    public static void main(String[] args) {
      customArrayList list = new customArrayList();
      list.add(45);
      list.add(54);
      list.add(34);
      int ans =    list.remove();
//      System.out.println(ans);
      System.out.println(list);
    }
}
