package com.rajshekar.generics;

public class genericMethod {
    public static <E> void PrintArray(E[] elements){
        for (E elem : elements){
            System.out.println(elem);
        }
    }

    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5};
//        System.out.println("Printing Integer Arrray:");
//        PrintArray(arr);

        System.out.println("Printing String Array;");
        String[] str = {"rajshekar","rachesh","rohit","prajwal"};
        PrintArray(str);
    }
}
