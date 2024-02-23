package com.rajshekar.Abstraction;

public  class Son extends Parent {
    public Son(int num) {
        super(num);
    }

    @Override
    void career() {
        System.out.println("I am going to be an Engineer!");
    }
    @Override
   void patner(){
        System.out.println("I Love coding");
   }

}
