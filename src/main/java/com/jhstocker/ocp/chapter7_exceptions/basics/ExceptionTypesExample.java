package com.jhstocker.ocp.chapter7_exceptions.basics;

public class ExceptionTypesExample {

    public static void main(String[] args) {

        // unchecked
        int x = 10 / 0; // ArithmeticException

        // checked (precisa tratar)
        // Thread.sleep(1000); ❌ não compila sem try/catch
    }
}