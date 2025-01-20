package br.com.exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double radio = sc.nextDouble();
        double pi = Math.PI;
        double area = pi * Math.pow(radio, 2);

        System.out.printf("A=%.4f", area);
        sc.close();
    }
}
