package com.jhstocker.ocp.chapter5_oop.polymorphism;

public class Dog extends Animal {
    void eat() {
        System.out.println("Dog eats");
    }

    void bark() {
        System.out.println("Dog barks");
    }
}