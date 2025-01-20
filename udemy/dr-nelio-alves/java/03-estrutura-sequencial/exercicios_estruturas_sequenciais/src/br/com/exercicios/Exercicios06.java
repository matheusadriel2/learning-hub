package br.com.exercicios;

import java.util.Scanner;

public class Exercicios06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        double triangle = A * C / 2;
        double circle = Math.PI * Math.pow(C, 2);
        double trapezoid = (A + B) * C / 2;
        double square = Math.pow(B, 2);
        double rectangle = A * B;

        System.out.printf("""
                TRIÂNGULO: %.3f
                CÍRCULO: %.3f
                TRAPÉZIO: %.3f
                QUADRADO: %.3f
                RETÂNGULO: %.3f
                """, triangle, circle, trapezoid, square, rectangle);

        sc.close();
    }
}
