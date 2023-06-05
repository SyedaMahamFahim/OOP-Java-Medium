package com.blog.inheritance;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 2022, 4);
        myCar.startEngine();  // Inherited from Vehicle class
        myCar.accelerate();   // Car-specific method
    }
}
