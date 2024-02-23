package com.rajshekar.SampleCode;

public class ObjectDemo {
    int num;
  float value;
    public ObjectDemo(int num, float value) {
        this.num = num;
        this.value = value;
    }

    public ObjectDemo(Object obj) {
    }


    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public ObjectDemo() {
        super();
    }

    public static void main(String[] args) {
        ObjectDemo obj  = new ObjectDemo(23, 45.5f);
        ObjectDemo obj2  = new ObjectDemo(23,485.45f);

//        System.out.println(obj.hashCode());
//        System.out.println(obj.getClass().getName());

        if (obj == obj2){
            System.out.println("obj is lesser than obj2");
        }
        if (obj.equals(obj2)){
            System.out.println("obj is lesser than obj2");
        }
        System.out.println(obj instanceof  ObjectDemo);
        System.out.println(obj instanceof  Object);

    }
}
