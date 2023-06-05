package com.blog.polymorphism;


/*
 * Polymorphism means “many forms”, and it occurs when we have many classes that are related to each other by inheritance.
 * Polymorphism is achieved through inheritance and method overriding. When a superclass reference variable is used to refer to a subclass object, polymorphism comes into play
 */

public class Main {
    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar();
        sportsCar.startEngine();
        System.out.println();
        sportsCar.stopEngine();
    }
}
