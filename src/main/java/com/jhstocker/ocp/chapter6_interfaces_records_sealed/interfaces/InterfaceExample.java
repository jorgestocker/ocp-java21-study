package com.jhstocker.ocp.chapter6_interfaces_records_sealed.interfaces;

public class InterfaceExample {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.eat();
        d.sleep();

        Animal.info();
    }
}