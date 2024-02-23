package com.rajshekar.generics;

import java.util.Arrays;

public class customGenArrayList<T> {

       private Object[] data;
       private static final int  DEFAULT_SIZE = 10;
       int size =0;

    public customGenArrayList() {
        this.data =  new Object[DEFAULT_SIZE];
    }
    public void add(T value){
        if(isFull()){
            reSize();
        }
        data[size++] =value;
    }
 public void reSize(){
     Object[] temp = new Object[data.length * 2];
     for (int i = 0; i <data.length ; i++) {
            temp[i] = (T)data[i];
     }
     data = temp;
 }
  public T remove(){
      T removed  =(T) data[--size];
        return removed;
  }
  public int size(){
        return  size;
  }
  public T get(int index){
        return (T)data[index];
  }

  public void set(int index , T value){
        data[index] = value;
  }

    @Override
    public String toString() {
        return "customGenArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public Boolean isFull(){
        return  size == data.length;
    }

    public static void main(String[] args) {
//      customGenArrayList list = new customGenArrayList();
//      list.add(45);
//      list.add(54);
//      list.add(34);
//      int ans =    list.remove();
////      System.out.println(ans);
//      System.out.println(list);

        customGenArrayList<Integer> list = new customGenArrayList();
        list.add(45);
        list.add(54);
        list.add(34);
        System.out.println(list);
//        ArrayList list3 = new ArrayList();
        customGenArrayList<String> list2 = new customGenArrayList<>();
        list2.add("rajshekar");
        list2.add("shiv");
        list2.add("rachesh");
        System.out.println(list2);
        System.out.println(list.remove());
        System.out.println(list);
    }

    public static interface genericInterface<T> {
        void display(T value);
    }
}
