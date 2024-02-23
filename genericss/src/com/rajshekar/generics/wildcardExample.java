package com.rajshekar.generics;

import java.util.Arrays;

public class wildcardExample<T extends Number> {
    private Object data[];
    private static final int DEFAULT_SIZE = 10;
    int size = 0;

    public wildcardExample() {
          this.data =new Object[DEFAULT_SIZE];
}
public   void  getList(wildcardExample<? extends  Number> list){
//        do something
    System.out.println(list);
}
public void add(T num){
        if(isFull()){
            reSize();
        }
        data[size++]=num;
}

    private void reSize() {
        Object[] temp = new Object[data.length * 2];
        for (int i = 0; i < data.length ; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }
    public int  size(){
        return size;
    }
    public void remove(){
        data[--size]= null;
    }
    public T get(int index){
        return (T)data[index];
    }

    private boolean isFull() {
        return size == data.length;
    }
    public void set(int index , T value){
        data[index] = value;
    }


    @Override
    public String toString() {
        return "practiceGenerics{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
//        wildcardExample<String> list = new wildcardExample<>();
//        list.add("rajshekar");
//        System.out.println(list);

        wildcardExample<Number> list2 = new wildcardExample<>();
        list2.add(4);
        list2.add(44.4);
        list2.add(6);
        list2.add(8);
        System.out.println(list2);
          list2.remove();
        list2.getList(list2);
        System.out.println(list2.get(25));
        System.out.println(list2.size);
        list2.size();

    }
}
