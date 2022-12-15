package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape{
private int a;

    public Circle(int a) {
        this.a = a;
    }

    public String getShapeName() {
    return "Circle";
    }

    public double getField() {
        return 3.14 * Math.pow(a, 2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return a == circle.a;
    }
}
