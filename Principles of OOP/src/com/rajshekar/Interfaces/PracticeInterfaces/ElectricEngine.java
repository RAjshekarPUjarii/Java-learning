package com.rajshekar.Interfaces.PracticeInterfaces;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("ElectricEngine starts a car ");

    }

    @Override
    public void stop() {
        System.out.println("ElectricEngine stop a car ");

    }

    @Override
    public void acc() {
        System.out.println("ElectricEngine acc a car ");

    }
}
