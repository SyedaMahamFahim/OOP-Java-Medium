package com.blog.abstractclass;

class SportsCar extends Car {

    public SportsCar(String brand, String model) {
        // ----- Super Keyword ------ //
        /*
         * The super keyword refers to superclass (parent) objects. It is used to call superclass methods and to access the superclass constructor.
         */
        super(brand, model);
    }
    @Override
    public void start() {
        System.out.println(getBrand() + " " + getModel() + " is starting like a powerful sports car.");
    }
    @Override
    public void stop() {
        System.out.println(getBrand() + " " + getModel() + " is stopping like a sports car.");
    }
}