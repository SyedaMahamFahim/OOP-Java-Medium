package com.blog.Interfaceclass;

public class Car implements Engine,Media{
    int a = 30;
        @Override
        public void start() {
            System.out.println("I start engine like a normal Car");
        }
        @Override
        public void stop() {
            System.out.println("I stop engine like a normal Car");
        }
        @Override
        public void acc() {
            System.out.println("I accelerate like a normal Car");
        }
    }