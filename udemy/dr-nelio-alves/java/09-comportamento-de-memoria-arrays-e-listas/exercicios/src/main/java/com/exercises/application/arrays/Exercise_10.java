package main.java.com.exercises.application.arrays;

import java.util.Scanner;
import main.java.com.exercises.entities.Student;

public class Exercise_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serão inseridos? ");
        int n = sc.nextInt();

        Student[] st = new Student[n];
        for (int i = 0; i < n; i++) {
            st[i] = new Student();
            System.out.printf("Digite o nome, primeira e segunda nota do %do aluno:\n", i+1);
            st[i].setName(sc.next());
            st[i].setFirstGrade(sc.nextDouble());
            st[i].setSecondGrade(sc.nextDouble());
        }

        for (int i = 0; i < st.length; i++) {
            st[i].isApproved();
        }

        sc.close();
    }
}
