package com.rajshekar.Interfaces.PracticeInterfaces;

import com.rajshekar.Interfaces.Brake;
import com.rajshekar.Interfaces.Engine;
import com.rajshekar.Interfaces.Media;

public class Car implements Engine, Brake, Media {
    int a=5;
    @Override
    public void brake() {
        System.out.println("I brake engine like a normal car ");

    }

    @Override
    public void start() {
        System.out.println("I start engine like a normal car ");

    }

    @Override
    public void stop() {
        System.out.println("I stop engine  like a normal car ");

    }

    @Override
    public void acc() {
        System.out.println("I accelerte engine like a normal car ");

    }
}
