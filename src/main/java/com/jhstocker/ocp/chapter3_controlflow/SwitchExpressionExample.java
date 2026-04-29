package com.jhstocker.ocp.chapter3_controlflow;

public class SwitchExpressionExample {

    public static void main(String[] args) {

        int day = 3;

        String result = switch (day) {
            case 1, 2, 3 -> "Start";
            case 4, 5 -> "Middle";
            case 6, 7 -> "End";
            default -> throw new IllegalArgumentException();
        };

        System.out.println(result);
    }
}