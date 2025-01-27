package main.java.com.exercises.application.arrays;

import java.util.Scanner;

public class Exercise_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos valores vai ter cada vetor? ");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int[] b = new int[n];
        System.out.println("Digite os valores do vetor B:");
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }

        int[] c = new int[n];
        System.out.println("Valor resultante: ");
        for (int i = 0; i < c.length; i++) {
            c[i] = a[i] + b[i];
            System.out.println(c[i]);
        }


        sc.close();
    }
}
