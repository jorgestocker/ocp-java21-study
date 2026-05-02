package com.jhstocker.ocp.chapter6_modern.interfaces;

public class InterfaceExample {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.eat();
        d.sleep();

        Animal.info();
    }
}