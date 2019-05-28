package org.itstep;

public class Circle {
    private double radius = 6.0;

    public double getRadius () {
        return radius;
    }

    public void setCircle (double radius){
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
