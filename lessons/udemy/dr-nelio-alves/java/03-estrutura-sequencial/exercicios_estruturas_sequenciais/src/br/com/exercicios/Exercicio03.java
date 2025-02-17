package br.com.exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int diff = (A * B) - (C * D);

        System.out.printf("DIFERENÇA = %d", diff);

        sc.close();
    }
}
