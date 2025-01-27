package main.java.com.exercises.application.lists;

import main.java.com.exercises.entities.Worker;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Worker> list = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println();
            System.out.println("Employee #" + i + ": ");

            System.out.print("Id: ");
            int id = sc.nextInt();
            while (hasId(list, id)) {
                System.out.print("Id already taken. Try again: ");
                id = sc.nextInt();
            }

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            list.add(new Worker(id, name, salary));
        }

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();
        Worker emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (emp == null) {
            System.out.println("This id does not exist!");
        }
        else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            emp.salaryIncrease(percentage);
        }

        System.out.println();
        System.out.println("List of employees:");
        for (Worker obj : list) {
            System.out.println(obj);
        }

        sc.close();
    }

    public static boolean hasId(ArrayList<Worker> list, int id) {
        Worker emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
