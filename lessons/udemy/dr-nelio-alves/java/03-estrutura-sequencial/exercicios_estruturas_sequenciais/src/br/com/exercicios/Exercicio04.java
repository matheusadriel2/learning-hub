package br.com.exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int workedHours = sc.nextInt();
        double salaryPerHour = sc.nextDouble();
        double salary = salaryPerHour * workedHours;

        System.out.printf("""
                NUMBER = %d
                SALARY = $ %.2f
                """, number, salary);

        sc.close();
    }
}
