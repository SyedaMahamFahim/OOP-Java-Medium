package com.blog.inheritance;

public class Vehicle {
    private String brand;
    private int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void startEngine() {
        System.out.println("Starting the engine of the vehicle...");
    }
    public void brandName(){
        System.out.println("Brand Name: "+ brand);
    }
    public void brandYear(){
        System.out.println("Brand Year: "+ year);
    }

}
