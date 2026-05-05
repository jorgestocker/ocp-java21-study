package com.jhstocker.ocp.chapter7_exceptions.overriding;

import java.io.IOException;
import java.io.FileNotFoundException;

class A2 {
    void test() throws IOException {}
}

class B2 extends A2 {

    @Override
    void test() throws FileNotFoundException {} // ✔ mais específico
}