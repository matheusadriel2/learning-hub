package main.java.com.exercicios.program;

import main.java.com.exercicios.entities.Employee;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();

        System.out.print("Name: ");
        emp.Name = sc.nextLine();
        System.out.print("Gross salary: ");
        emp.GrossSalary = sc.nextDouble();
        System.out.print("Tax: \n");
        emp.Tax = sc.nextDouble();

        System.out.printf("""
                Name: %s
                Gross salary: %.2f
                Tax: %.2f
                """, emp.Name, emp.GrossSalary, emp.Tax);

        System.out.printf("Employee: %s , $ %.2f\n", emp.Name, emp.NetSalary());

        System.out.print("Which percentage to increase salary? ");
        emp.IncreaseSalary(sc.nextDouble());

        System.out.printf("Updated data: %s, $ %.2f\n", emp.Name, emp.GrossSalary);
    }
}
