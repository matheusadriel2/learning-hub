package br.com.exercises03.rectangle;

public class RectangleRoomCalculator implements GeometricCalc {
    double area;
    double perimeter;

    @Override
    public double calculateArea(double height, double width) {
        this.area = height * width;
        return this.area;
    }

    public double calculatePerimeter(double height, double width) {
        this.perimeter = 2 * (height + width);
        return this.perimeter;
    }

}
