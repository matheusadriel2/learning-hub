package br.com.alura.exercises;

public class Triangle implements Shape {
    private int base;
    private int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void calculateArea() {
        int area = (base * height) / 2;
        System.out.println("Area of the triangle: " + area);
    }
}
