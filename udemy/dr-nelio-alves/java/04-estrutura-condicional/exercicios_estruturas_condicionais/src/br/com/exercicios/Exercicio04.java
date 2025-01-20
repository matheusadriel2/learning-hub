package br.com.exercicios;

import java.time.Duration;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();
        int duration;

        if (start < end) {
            duration = end - start;
        } else {
            duration = 24 - start + end;
        }

        System.out.printf("O JOGO DUROU %d HORAS.", duration);

        sc.close();
    }
}
