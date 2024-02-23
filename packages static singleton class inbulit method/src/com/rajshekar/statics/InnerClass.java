package com.rajshekar.statics;

  public class InnerClass {
      // inner class is not dependent on outer class when class make as static
//       nested class can be static class

// object create on runtime
    static class Test{
        String name;
        public Test(String name){
             this.name = name;
         }

    }

      public static void main(String[] args) {

          Test raj = new Test("rajshekar");
          Test shiv = new Test("shivling");
          System.out.println(raj.name);
          System.out.println(shiv.name);
      }


}
