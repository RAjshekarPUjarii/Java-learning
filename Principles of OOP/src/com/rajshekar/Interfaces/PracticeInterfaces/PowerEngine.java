package com.rajshekar.Interfaces.PracticeInterfaces;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("PowerEngine starts a car ");
    }

    @Override
    public void stop() {
        System.out.println("PowerEngine stops a car ");

    }

    @Override
    public void acc() {
        System.out.println("PowerEngine accelarate a car ");

    }
}
