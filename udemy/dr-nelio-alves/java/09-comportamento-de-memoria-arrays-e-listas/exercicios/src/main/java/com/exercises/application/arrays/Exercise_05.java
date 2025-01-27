package main.java.com.exercises.application.arrays;

import java.util.Scanner;

public class Exercise_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        double[] numbers = new double[n];
        double bigger = 0;
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Digite um número: ");
            numbers[i] = sc.nextDouble();
            if (numbers[i] > bigger) {
                bigger = numbers[i];
                index = i;
            }
        }

        System.out.printf("Maior valor: %.2f%n", bigger);
        System.out.printf("Posição do maior valor = %d%n", index);
        sc.close();
    }
}
