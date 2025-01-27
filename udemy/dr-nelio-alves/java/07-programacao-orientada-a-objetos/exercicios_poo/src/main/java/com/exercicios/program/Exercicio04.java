package main.java.com.exercises.program;

import main.java.com.exercises.util.CurrencyConverter;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double price = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        double amount = sc.nextDouble();

        System.out.printf("Amount to be paid in reais: $%.2f", CurrencyConverter.calc(price, amount));

        sc.close();
    }
}
