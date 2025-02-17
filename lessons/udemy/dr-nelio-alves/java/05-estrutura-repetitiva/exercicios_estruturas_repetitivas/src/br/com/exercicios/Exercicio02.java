package br.com.exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        while (x != 0 || y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("Primeiro");
            } else if (x < 0 && y > 0) {
                System.out.println("Second");
            } else if (x < 0 && y < 0) {
                System.out.println("Third");
            } else if (x > 0 && y < 0) {
                System.out.println("Fourth");
            } else {
                break;
            }
            x = sc.nextInt();
            y = sc.nextInt();
        }

        sc.close();
    }
}
