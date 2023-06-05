package com.blog.polymorphism;

class Car extends Vehicle {

    // ---- Override -----//
    /*  Method overriding is a feature that allows a subclass to provide a different      implementation for a method that is already defined in its superclass.
     * Method overriding enables a subclass to define its own behaviour while still maintaining the same method signature as the superclass.
     */
    
    @Override
    public void startEngine() {
        super.startEngine();  // Calling the overridden method in the superclass
        System.out.println("Starting the engine of the car...");
    }
    
    @Override
    public void stopEngine() {
        super.stopEngine();   // Calling the overridden method in the superclass
        System.out.println("Stopping the engine of the car...");
    }
}