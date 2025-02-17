package br.com.exercicios;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 1; i <= N ; i++) {
            double sqr = Math.pow(i, 2);
            double cub = Math.pow(i, 3);
            System.out.printf("%d %.0f %.0f%n", i, sqr, cub);
        }

        sc.close();
    }
}
