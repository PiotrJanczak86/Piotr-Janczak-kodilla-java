package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        int addResult = 10 + 5;
        int subtractResult = 10 - 5;

        if (addResult == calc.add(10, 5)) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        if (subtractResult == calc.subtract(10, 5)) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
    }
}

