package com.blog.abstractclass;

public class Main {
    public static void main(String[] args) {
        Car sportsCar = new SportsCar("Ferrari", "488 GTB");
        sportsCar.start();
        sportsCar.stop();
    }
}
