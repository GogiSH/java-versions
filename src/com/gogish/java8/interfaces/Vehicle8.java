package com.gogish.java8.interfaces;

public interface Vehicle8 {
    default void start() {
        System.out.println("Car8 is running...");
    }

    static void stop() {
        System.out.println("Car8 is stopping...");
    }

    default void move() {
        start();
        stop();
    }
}
