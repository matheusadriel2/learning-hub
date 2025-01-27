package main.java.com.exercises.application.arrays;

import java.util.Scanner;

public class Exercise_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.println("Quantos números você vai digitar? (De 1 a 10)");
            n = sc.nextInt();
            if (n <= 0 && n > 10) {
                System.out.println("Inválido.");
            }
        } while (n <= 0 && n > 10);

        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            System.out.print("Digite um número: ");
            a[i] = sc.nextInt();
        }

        System.out.println("+===+===+===+===+===+");
        System.out.println("Números negativos: ");
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                System.out.println(a[i]);
            }
        }
        System.out.println("+===+===+===+===+===+");
        sc.close();
    }
}
