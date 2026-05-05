package com.jhstocker.ocp.mocktests;

import java.io.IOException;

class A {
    void test() throws IOException {}
}

class B extends A {
    void test() {}
}

public class MockExceptionTest {

    public static void main(String[] args) throws IOException {

        A obj = new B();
        obj.test();
    }
}