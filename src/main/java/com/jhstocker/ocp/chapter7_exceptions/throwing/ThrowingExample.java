package com.jhstocker.ocp.chapter7_exceptions.throwing;

public class ThrowingExample {

    static void validateAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Underage");
        }
        System.out.println("Valid age");
    }

    public static void main(String[] args) {

        validateAge(20);
        // validateAge(10); // 💥 runtime exception
    }
}