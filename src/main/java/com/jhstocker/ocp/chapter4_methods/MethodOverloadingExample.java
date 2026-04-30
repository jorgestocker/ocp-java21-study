package com.jhstocker.ocp.chapter4_methods;

public class MethodOverloadingExample {

    public static void main(String[] args) {

        print(10);
        print(10L);
        print(10.5);
    }

    public static void print(int x) {
        System.out.println("int");
    }

    public static void print(long x) {
        System.out.println("long");
    }

    public static void print(double x) {
        System.out.println("double");
    }
}