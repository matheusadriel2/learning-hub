package br.com.exercicios;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = (N - 1); i > 1; i--) {
            N = N * i;
            System.out.println(N);
        }

        sc.close();
    }
}
