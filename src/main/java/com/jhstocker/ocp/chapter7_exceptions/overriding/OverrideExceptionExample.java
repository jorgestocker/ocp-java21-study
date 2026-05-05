package com.jhstocker.ocp.chapter7_exceptions.overriding;

import java.io.IOException;

class A {
    void test() throws IOException {
        System.out.println("A");
    }
}

class B extends A {

    @Override
    void test() throws IOException {
        System.out.println("B");
    }
}

public class OverrideExceptionExample {

    public static void main(String[] args) throws IOException {

        A obj = new B();
        obj.test();
    }
}