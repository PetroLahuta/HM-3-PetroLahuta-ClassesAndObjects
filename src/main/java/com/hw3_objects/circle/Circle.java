package main.java.com.hw3_objects.circle;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    private double calculateArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Площа круга з радіусом [" + radius + "] = " + calculateArea();
    }
}