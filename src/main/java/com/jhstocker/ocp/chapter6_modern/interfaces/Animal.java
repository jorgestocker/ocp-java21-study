package com.jhstocker.ocp.chapter6_modern.interfaces;

public interface Animal {

    void eat();

    default void sleep() {
        System.out.println("Sleeping");
    }

    static void info() {
        System.out.println("Animal interface");
    }
}