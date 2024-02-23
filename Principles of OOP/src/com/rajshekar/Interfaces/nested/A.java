package com.rajshekar.Interfaces.nested;

public class A {
    public interface nestedInterfaces{
        public Boolean isOdd(int num);
    }
}
class  B implements A.nestedInterfaces{
    @Override
    public  Boolean isOdd(int num) {
        return (num & 1 ) == 1;
    }
}
