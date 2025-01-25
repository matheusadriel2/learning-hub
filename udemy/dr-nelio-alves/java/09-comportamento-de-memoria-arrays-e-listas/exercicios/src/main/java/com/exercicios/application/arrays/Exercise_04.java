package main.java.com.exercicios.application.arrays;

import java.util.Scanner;

public class Exercise_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        int[] numbers = new int[n];
        int oddQuantity = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Digite um número: ");
            numbers[i] = sc.nextInt();
            if (numbers[i] % 2 == 0) {
                oddQuantity++;
            }
        }

        System.out.println("\nNúmeros pares: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + " ");
            }
        }

        System.out.println("\n\nQuantidade de pares: " + oddQuantity);

        sc.close();
    }
}
