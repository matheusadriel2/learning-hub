package main.com.java.model.entities;

import main.com.java.model.enums.Color;

public class Circle extends Shape{
    private Double radius;

    public Circle() {
    }

    public Circle(Double radius) {
        this.radius = radius;
    }

    public Circle(Double radius, Color color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
