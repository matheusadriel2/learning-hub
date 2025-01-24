package main.java.com.exercicios.application;

import java.util.Scanner;
import main.java.com.exercicios.entities.PersonData;

public class Exercise_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();

        PersonData[] pd = new PersonData[n];
        double sum = 0;
        int male = 0;
        int female = 0;
        for (int i = 0; i < pd.length; i++) {
            pd[i] = new PersonData();
            System.out.printf("Altura da %da pessoa: ", i+1);
            pd[i].setHeight(sc.nextDouble());
            System.out.printf("Gênero da %da pessoa: ", i+1);
            pd[i].setGenre(sc.next().charAt(0));
            if (pd[i].getGenre() == 'F') {
                sum += pd[i].getHeight();
                female++;
            } else if (pd[i].getGenre() == 'M') {
                male++;
            }
        }

        double avg = sum / female;

        double minor = pd[0].getHeight();
        double major = pd[0].getHeight();
        for (int i=1; i<n; i++) {
            if (pd[i].getHeight() > major) {
                major = pd[i].getHeight();
            }
            if (pd[i].getHeight() < minor) {
                minor = pd[i].getHeight();
            }
        }

        System.out.printf("""
                Menor altura = %.2f
                Maior altura = %.2f
                Média das alturas das mulheres = %.2f
                Número de homens = %d
                """, minor, major, avg, male);

        sc.close();
    }
}
