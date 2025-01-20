package br.com.exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = N;
        int in = 0;
        int out = 0;

        for (int i = 1; i <= N; i++) {
            if (X >= 10 && X <= 20) {
                in += 1;
            } else {
                out += 1;
            }
            X = sc.nextInt();
        }

        System.out.printf("""
                %d in
                %d out
                """, in, out);

        sc.close();
    }
}
