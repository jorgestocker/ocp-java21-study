package com.jhstocker.ocp.chapter2_operators;

public class TypePromotionExample {

    public static void main(String[] args) {

        byte a = 10;
        byte b = 20;

        // byte c = a + b; ❌ NÃO compila

        int c = a + b; // ✔ vira int automaticamente

        System.out.println(c);

        short s = 10;
        // s = s + 5; ❌ NÃO compila

        s += 5; // ✔ funciona (cast implícito)

        System.out.println(s);
    }
}