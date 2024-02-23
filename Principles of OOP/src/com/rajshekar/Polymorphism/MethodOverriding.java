package com.rajshekar.Polymorphism;

    class parent {
        void display(){
            System.out.println("I am in parent class");
        }
    }
     class child extends  parent {
        @Override  // this is called inotation  and it is used to check method is overriden or not
        void display() {
//            super.display(); it will call super class
            System.out.println("I am in child class");
        }
    }

        public class MethodOverriding{
            public static void main(String[] args) {
                child obj = new child();
                obj.display();
            }
        }
