package org.itstep;

public class Triangle extends Shape {
    private double hight = 6.0;
    private double foundation = 3.0;

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public double getFoundation() {
        return foundation;
    }

    public void setFoundation(double foundation) {
        this.foundation = foundation;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "hight=" + hight +
                ", foundation=" + foundation +
                '}';
    }
}
