package main.java.com.exercises.application.arrays;

import java.util.Scanner;

public class Exercise_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos o vetor vai ter? ");
        int n = sc.nextInt();

        double[] numbers = new double[n];
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Digite um número: ");
            numbers[i] = sc.nextDouble();
            sum += numbers[i];
        }

        double avg = sum / numbers.length;
        System.out.printf("\nMédia do vetor: %.3f\n", avg);
        System.out.printf("Elementos abaixo da média:\n");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] <= 10.0) {
                System.out.printf("%.1f\n", numbers[i]);
            }
        }



        sc.close();
    }
}
