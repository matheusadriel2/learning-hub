package main.com.java.application;

import main.com.java.model.entities.Employee;
import main.com.java.model.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        ArrayList<Employee> emps = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.printf("Employee #%d data:\n", i+1);
            System.out.print("Outsourced (y/n)? ");
            char ans = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.next();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.println("Value per hour: ");
            double salaryPerHour = sc.nextDouble();
            if (ans == 'y') {
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                emps.add(new OutsourcedEmployee(name, hours, salaryPerHour, additionalCharge));
            } else {
                emps.add(new Employee(name, hours, salaryPerHour));
            }
        }

        System.out.println();
        System.out.println("Payments: ");
        for (Employee emp: emps) {
            System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
        }

        sc.close();
    }
}
