package com.gogish.java8.interfaces;

public class Main7 {
    public static void main(String[] args) {
        Car7 car = new Car7();
        car.start();
        // Problem: Every class that implements Vehicle must define start(). No default behavior is possible.
    }
}