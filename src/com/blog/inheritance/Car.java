package com.blog.inheritance;

class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, int year, int numberOfDoors) {
        // ---- Super ----- //
        /*
         * The super keyword refers to superclass (parent) objects. It is used to call superclass methods and to access the superclass constructor.
        */

        super(brand, year);
        this.numberOfDoors = numberOfDoors;
    }

    public void accelerate() {
        System.out.println("Accelerating the car..." + numberOfDoors);
    }
}