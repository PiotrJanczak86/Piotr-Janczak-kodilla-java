package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape{

    private int a;

    public Square(int a) {
        this.a = a;
    }

    public String getShapeName() {
    return "Square";
    }

    public double getField() {
        return Math.pow(a, 2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return a == square.a;
    }
}
