package com.jhstocker.ocp.chapter1_basics;

public class PrimitiveTypesExample {

    public static void main(String[] args) {

        byte b = 10;
        short s = 20;

        // byte result = b + s; ❌ NÃO compila (vira int)

        int result = b + s; // OK

        int x = 5;
        System.out.println(x++ + ++x); // pegadinha clássica

        System.out.println(result);
    }
}