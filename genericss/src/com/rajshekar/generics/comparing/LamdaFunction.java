package com.rajshekar.generics.comparing;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LamdaFunction {
    public static void main(String[] args) {
          ArrayList<Integer> list = new ArrayList<>();
             for (int i = 0; i < 5; i++) {
                list.add(i + 2);
         }
//       System.out.println(list);  // below is lamda expression
         Consumer<Integer> fun = (item) -> System.out.print(item * 2 + " ");
         list.forEach(fun);

// lamda expression
        operationLamda sum = (a, b) -> a + b;
        operationLamda sub = (a, b) -> a - b;
        operationLamda prod = (a, b) -> a * b;

        LamdaFunction myCalculator = new LamdaFunction();
        System.out.println(myCalculator.operate(2,3,sum));
        System.out.println(myCalculator.operate(2,3,prod));
        System.out.println(myCalculator.operate(2,3,sub));

}
    private int operate(int a, int b, operationLamda op) {
       return op.operation(a, b);
    }
}

