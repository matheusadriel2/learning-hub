package br.com.exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("""
                Escolha seu combustível:
                
                +===+===+===+
                1. Álcool
                2. Gasolina
                3. Diesel
                4. Sair
                +===+===+===+
                """);

        int alcohol = 0;
        int gasoline = 0;
        int diesel = 0;
        int choice = sc.nextInt();

        while (choice != 4) {
            if (choice == 1) {
                alcohol += 1;
            } else if (choice == 2) {
                gasoline += 1;
            } else if (choice == 3) {
                diesel += 1;
            }
            choice = sc.nextInt();
        }

        System.out.printf("""
                Muito obrigado!
                Álcool: %d
                Gasolina: %d
                Diesel: %d
                """, alcohol, gasoline, diesel);

        sc.close();
    }
}
