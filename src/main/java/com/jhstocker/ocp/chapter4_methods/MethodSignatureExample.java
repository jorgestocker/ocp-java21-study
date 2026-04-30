package com.jhstocker.ocp.chapter4_methods;

public class MethodSignatureExample {

    public static void main(String[] args) {
        sayHello();
        sayHello("Jorge");
    }

    public static void sayHello() {
        System.out.println("Hello");
    }

    public static void sayHello(String name) {
        System.out.println("Hello " + name);
    }
}