package br.com.exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            double div = (double) a / b;
            if (b == 0) {
                System.out.printf("Divisão Impossível%n");
            } else {
                System.out.printf("%.1f%n", div);
            }
        }

        sc.close();
    }
}
