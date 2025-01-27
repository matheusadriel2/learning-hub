package main.java.com.exercises.application.arrays;

import java.util.Scanner;

public class Exercise_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        do {
            System.out.println("Quantos números você vai digitar? ");
            n = sc.nextInt();
        } while (n <= 0);

        double[] vect = new double[n];
        double sum = 0;

        for (int i = 0; i < vect.length; i++) {
            System.out.println("Digite um número: ");
            vect[i] = sc.nextDouble();
            sum += vect[i];
        }

        double avg = sum / n;

        System.out.print("VALORES =");
        for (int i = 0; i < vect.length; i++) {
            System.out.print(" " + vect[i] + " ");
        }
        System.out.printf("%nSOMA = %.2f%n", sum);
        System.out.printf("MÉDIA = %.2f%n", avg);




        sc.close();
    }
}
