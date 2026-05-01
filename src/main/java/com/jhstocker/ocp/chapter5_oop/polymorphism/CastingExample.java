package com.jhstocker.ocp.chapter5_oop.polymorphism;

public class CastingExample {

    public static void main(String[] args) {

        Animal a = new Dog();

        a.eat(); // 👈 imprime

        Dog d = (Dog) a;
        d.bark(); // 👈 imprime

        Animal b = new Animal();

        // Força erro em runtime:
        // Dog d2 = (Dog) b; // 💥 ClassCastException
    }
}
