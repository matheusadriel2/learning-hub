package br.com.exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um número: ");
        int r = sc.nextInt();

        if (r >= 0) {
            System.out.println("NÃO NEGATIVO");
        } else {
            System.out.println("NEGATIVO");
        }

        sc.close();
    }}
