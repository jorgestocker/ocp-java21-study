package com.jhstocker.ocp.chapter1_basics;

public class VarRulesExample {

    public static void main(String[] args) {

        var number = 10; // OK
        var text = "hello"; // OK

        // var x; ❌ NÃO compila (precisa inicializar)

        // var a = null; ❌ NÃO compila

        var list = java.util.List.of(1, 2, 3); // inferência funciona

        System.out.println(list);
    }
}