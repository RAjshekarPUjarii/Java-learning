package com.rajshekar.AccessModifier;

 class B extends A{
     public B(int num) {
         super(num);
     }

     public static void main(String[] args) {
         B obj = new B(45);
     }
}
