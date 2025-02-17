package br.com.exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int code = sc.nextInt();
        int quantity = sc.nextInt();

        if (code == 1) {
            System.out.printf("Total: R$ %.2f", quantity * 4.00);
        } else if (code == 2) {
            System.out.printf("Total : R$ %.2f", quantity * 4.50);
        } else if (code == 3) {
            System.out.printf("Total : R$ %.2f", quantity * 5.00);
        } else if (code == 4) {
            System.out.printf("Total : R$ %.2f", quantity * 2.00);
        } else if (code == 5) {
            System.out.printf("Total : R$ %.2f", quantity * 1.50);
        }

        sc.close();
    }
}
