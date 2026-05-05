package com.jhstocker.ocp.chapter7_exceptions.trycatch;

public class TryCatchExample {

    public static void main(String[] args) {

        try {
            int x = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error");
        } finally {
            System.out.println("Finally");
        }
    }
}