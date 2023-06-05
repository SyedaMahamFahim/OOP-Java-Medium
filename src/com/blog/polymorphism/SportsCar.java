package com.blog.polymorphism;

class SportsCar extends Car {
    @Override
    public void startEngine() {
        super.startEngine();  // Calling the overridden method in the immediate superclass
        System.out.println("Starting the engine of the sports car...");
    }
    
    @Override
    public void stopEngine() {
        super.stopEngine();   // Calling the overridden method in the immediate superclass
        System.out.println("Stopping the engine of the sports car...");
    }
}
