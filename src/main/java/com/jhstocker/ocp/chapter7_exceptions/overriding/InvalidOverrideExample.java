package com.jhstocker.ocp.chapter7_exceptions.overriding;

import java.io.IOException;

class A1 {
    void test() throws IOException {}
}

class B1 extends A1 {

    // ❌ NÃO compila (mais amplo)
    // void test() throws Exception {}
}