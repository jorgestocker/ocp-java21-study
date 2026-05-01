package com.jhstocker.ocp.chapter5_oop.polymorphism;

public class PolymorphismExample {

    public static void main(String[] args) {

        Animal a = new Dog();

        a.eat(); // ?

        // a.bark(); ❌ não compila

        Dog d = (Dog) a;
        d.bark(); // ✔
    }
}