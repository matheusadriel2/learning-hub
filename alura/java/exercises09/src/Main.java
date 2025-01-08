import br.com.alura.exercises.Shape;
import br.com.alura.exercises.Triangle;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Shape triangle1 = new Triangle(3, 5);
        Shape triangle2 = new Triangle(4, 6);

        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(triangle1);
        shapes.add(triangle2);

        for (Shape shape : shapes) {
            shape.calculateArea();
        }
    }
}