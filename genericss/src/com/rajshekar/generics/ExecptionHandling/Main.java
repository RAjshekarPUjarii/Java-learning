package com.rajshekar.generics.ExecptionHandling;
public class Main {
    public static void main(String[] args) {
        int a = 4;
        int b = 0;
        try {
//            divide(a, b);
//            throw new Exception("just for fun");
            throw new MyException("this too for fun ");

        }catch (MyException e){
            System.out.println("this my execption");
        }
        catch (ArithmeticException e) { // Exception is superclass and we can this or else we can write Arithmetic E
            System.out.println(e);
//            System.out.println(e.getMessage());
        }catch (Exception e) {
            System.out.println("just a randow error");
        } finally {
            System.out.println("this block always will execute ");
        }
    }

    static  int divide(int a , int b ) throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException("hey please do not divide by zero");
        }
        return a/b;
    }
}
