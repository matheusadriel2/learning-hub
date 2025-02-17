package br.com.exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("INSIRA UM VALOR: ");
        double v = sc.nextDouble();

        if (v > 0 && v <= 25) {
            System.out.printf("Intervalo [0,25]");
        } else if (v > 25 && v <= 50) {
            System.out.printf("Intervalo [25,50]");
        } else if (v > 50 && v <= 75) {
            System.out.printf("Intervalo [50,75]");
        } else if (v > 75 && v <= 100) {
            System.out.printf("Intervalo [75,100]");
        } else {
            System.out.println("Fora de intervalo");
        }

        sc.close();
    }
}
