package main.java.com.exercicios.application;

import main.java.com.exercicios.entities.PersonHeight;

import java.util.Scanner;

public class Exercise_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão analisadas? ");
        int n = sc.nextInt();

        PersonHeight[] p1 = new PersonHeight[n];
        for (int i = 0; i < p1.length; i++) {
            p1[i] = new PersonHeight();
            System.out.printf("Dados da %da pessoa:%n", i + 1);
            System.out.print("Nome: ");
            p1[i].setName(sc.next());
            System.out.print("Idade: ");
            p1[i].setAge(sc.nextInt());
            System.out.print("Altura: ");
            p1[i].setHeight(sc.nextDouble());
        }

        double sum = 0;
        double minor = 0;

        for (int i = 0; i < p1.length; i++) {
            sum += p1[i].getHeight();
            if (p1[i].getAge() < 16) {
                minor += 1;
            }
        }

        double avg = sum / n;
        minor = (minor / n) * 100;

        System.out.printf("Altura média: %.2f%n", avg);
        System.out.printf("Pessoas com menos de 16 anos: %.2f%n", minor);
        for (int i = 0; i < p1.length; i++) {
            if (p1[i].getAge() < 16) {
                System.out.println(p1[i].getName());
            }
        }


        sc.close();
    }
}
