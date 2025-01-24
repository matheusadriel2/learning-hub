package main.java.com.exercicios.application;

import java.util.Scanner;

public class Exercise_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos o vetor vai ter? ");
        int n = sc.nextInt();

        int[] numbers = new int[n];
        int sum = 0;
        int odd = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Digite um número: ");
            numbers[i] = sc.nextInt();
            if (numbers[i] % 2 == 0) {
                sum += numbers[i];
                odd++;
            }
        }

        double avg = (double) sum / odd;

        if (odd > 0) {
            System.out.printf("\nMédia dos pares: %.1f\n", avg);
        } else {
            System.out.println("Nenhum número par");
        }

        sc.close();
    }
}
