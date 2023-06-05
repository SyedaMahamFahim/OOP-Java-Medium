package com.blog.abstractclass;


// ----- Abstract Class -----//
/*
 * Abstract methods are methods that must be overridden by the subclass in order for the subclass to have any meaningful functionality. By specifying the abstract modifier, you can require that certain methods be overridden by subclasses.
 */
abstract class Car {
    private String brand;
    private String model;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public abstract void start();

    public abstract void stop();
}
