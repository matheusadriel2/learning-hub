package main.java.com.exercicios.application;

import java.util.Scanner;

public class Exercise_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas você vai analisar? ");
        int n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];
        int olderAge = 0;
        String olderName = " ";
        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %da pessoa: \n", i+1);
            System.out.print("Nome: ");
            nomes[i] = sc.next();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
            if (idades[i] > olderAge) {
                olderAge = idades[i];
                olderName = nomes[i];
            }
        }

        System.out.printf("Pessoa mais velha: %s", olderName);

        sc.close();
    }
}
