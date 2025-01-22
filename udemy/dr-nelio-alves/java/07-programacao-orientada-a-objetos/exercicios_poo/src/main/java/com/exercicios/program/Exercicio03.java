package main.java.com.exercicios.program;

import main.java.com.exercicios.entities.Student;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student1 = new Student();

        System.out.print("Digite o nome do aluno: ");
        student1.name = sc.nextLine();

        do {
            System.out.print("Digite a nota do primeiro trimestre: ");
            student1.firstGrade = sc.nextDouble();
            if (student1.firstGrade < 0 && student1.firstGrade > 30.00) {
                System.out.println("Nota inválida!");
            }
        } while (student1.firstGrade < 0 && student1.firstGrade > 30.00);

        do {
            System.out.print("Digite a nota do segundo trimestre: ");
            student1.secondGrade = sc.nextDouble();
            if (student1.secondGrade < 0 && student1.secondGrade > 30.00) {
                System.out.println("Nota inválida!");
            }
        } while (student1.secondGrade < 0 && student1.secondGrade > 30.00);

        do {
            System.out.print("Digite a nota do terceiro trimestre: ");
            student1.thirdGrade = sc.nextDouble();
            if (student1.thirdGrade < 0 && student1.thirdGrade > 30.00) {
                System.out.println("Nota inválida!");
            }
        } while (student1.thirdGrade < 0 && student1.thirdGrade > 30.00);

        System.out.printf("FINAL GRADE = %.2f\n", student1.finalGrade());
        student1.isApproved();

        sc.close();
    }
}
