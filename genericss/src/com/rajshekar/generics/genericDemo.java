package com.rajshekar.generics;

import java.util.ArrayList;
import java.util.List;

// Type-safety
// Type casting is not required
// Compile-Time Checking

public class genericDemo {
    public static void main(String[] args) {
        List obj = new ArrayList();
        obj.add("raj");
        String s = (String) obj.get(0);  // type casting is required
        System.out.println(s);


         List<String> list = new ArrayList<>();
//         list.add(4);
//         list.add(34);
            list.add("rajshekar");
        String s2 = (String) obj.get(0);  // type casting is not required

        System.out.println(s2);


    }
}
