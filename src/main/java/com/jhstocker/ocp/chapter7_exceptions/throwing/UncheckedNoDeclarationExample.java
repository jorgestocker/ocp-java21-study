package com.jhstocker.ocp.chapter7_exceptions.throwing;

public class UncheckedNoDeclarationExample {

    static void test() {
        throw new RuntimeException();
    }

    public static void main(String[] args) {
        test(); // ✔ compila sem throws
    }
}