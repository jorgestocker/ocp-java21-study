package com.jhstocker.ocp.chapter7_exceptions.throwing;

import java.io.IOException;

public class ThrowsExample {

    static void readFile() throws IOException {
        throw new IOException("File error");
    }

    public static void main(String[] args) {

        try {
            readFile();
        } catch (IOException e) {
            System.out.println("Handled");
        }
    }
}