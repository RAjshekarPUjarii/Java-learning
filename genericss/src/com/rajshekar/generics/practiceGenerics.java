package com.rajshekar.generics;

import java.util.Arrays;

public class practiceGenerics<T> {
    private Object data[];
    private static final int DEFAULT_SIZE = 10;
    int size = 0;

    public practiceGenerics() {
          this.data =new Object[DEFAULT_SIZE];
}
public void add(int num){
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
    public T remove(){
        T removed = (T)data[--size];
        return  removed;
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
        practiceGenerics<Integer> list = new practiceGenerics<>();
        list.add(45);
        list.add(5);
        list.add(4);
        System.out.println(list.size());
        int ans = list.get(1);
        int removed = list.remove();
        System.out.println(removed);
        System.out.println(ans);
        System.out.println(list);

    }
}
