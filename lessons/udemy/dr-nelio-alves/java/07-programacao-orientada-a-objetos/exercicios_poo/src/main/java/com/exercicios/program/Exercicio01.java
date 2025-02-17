package main.java.com.exercises.program;

import main.java.com.exercises.entities.Rectangle;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.printf("Enter rectangle width and height: \n");
        rectangle.Width = sc.nextDouble();
        rectangle.Height = sc.nextDouble();

        System.out.printf("""
                AREA: %.2f
                PERIMETER: %.2f
                DIAGONAL: %.2f
                """, rectangle.Area(), rectangle.Perimeter(), rectangle.Diagonal());
    }
}
