package main.java.com.application;

import main.java.com.model.entities.Contributors;
import main.java.com.model.entities.Individual;
import main.java.com.model.entities.Legal;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        ArrayList<Contributors> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.printf("Tax payer #%d data:\n", i+1);
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Anual income: ");
            double income = sc.nextDouble();
            if (ch == 'i') {
                System.out.print("Health expenditures: ");
                double health = sc.nextDouble();
                list.add(new Individual(name, income, health));
            } else if (ch == 'c') {
                System.out.print("Number of employees: ");
                int emp = sc.nextInt();
                list.add(new Legal(name, income, emp));
            }
        }

        System.out.println();
        System.out.println("TAXES PAID:");
        double sum = 0.0;
        for (Contributors c : list) {
            System.out.printf("%s: $ %.2f\n", c.getName(), c.tax());
            sum += c.tax();
        }

        System.out.println();
        System.out.printf("TOTAL TAXES: $ %.2f", sum);
        sc.close();
    }
}
