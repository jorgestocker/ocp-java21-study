package com.jhstocker.ocp.chapter3_controlflow;
public class BreakContinueExample {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

            if (i == 2) continue;

            if (i == 4) break;

            System.out.println(i);
        }
    }
}
