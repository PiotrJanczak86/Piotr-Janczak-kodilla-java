package com.kodilla.testing.shape;

public class Triangle implements Shape{

    private int a;

    public Triangle(int a) {this.a = a;}

    public String getShapeName() {return "Triangle";}

    public double getField() {
        return Math.pow(a, 2) * Math.pow(3, 0.5) / 4;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return a == triangle.a;
    }
}
