package com.gogish.java8.interfaces;

public class Main8 {
    public static void main(String[] args) {
        Car8 car = new Car8();
        car.start();
        // car.stop(); -> error
        Vehicle8.stop();
        car.move();
        /*
          Default methods allow defining behavior inside an interface.
          Static methods can be called on the interface directly.
         */
    }
}
