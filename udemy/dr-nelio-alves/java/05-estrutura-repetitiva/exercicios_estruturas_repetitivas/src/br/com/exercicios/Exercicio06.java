package br.com.exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double avg;

        for (int i = 1; i <= N; i++) {
             double a = sc.nextDouble();
             double b = sc.nextDouble();
             double c = sc.nextDouble();
             avg = (a * 2 + b * 3 + c * 5) / 10;
            System.out.printf("%.1f%n", avg);
        }

        sc.close();
    }
}
