package com.kodilla.exception.exponentiation;


public class Exponentiation {

    public int operation(int a, int b) throws RuntimeException {
        if (a < 0 || b < 0) {
            throw new RuntimeException();
        }

        int c = 1;

        for (int i = 1; i <= b; i++) {
            c = c * a;
        }
        return c;
    }


    public static void main(String[] args) {

        try {
            Exponentiation exponentiation = new Exponentiation();
            int result = exponentiation.operation(5, 0);
            System.out.println(result);
        } catch (RuntimeException e) {
            System.out.println("Please enter number equal or greater than 0");
        }
    }
}
