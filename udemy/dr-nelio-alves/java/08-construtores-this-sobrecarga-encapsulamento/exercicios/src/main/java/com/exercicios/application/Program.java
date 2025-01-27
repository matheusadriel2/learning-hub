package main.java.com.exercises.application;

import main.java.com.exercises.entities.Bank;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank account;

        System.out.print("Enter account number: ");
        int id = sc.nextInt();
        System.out.print("Enter account holder: ");
        String name = sc.next();
        sc.nextLine();
        System.out.print("Is there a initial deposit (y/n)? ");
        char answer = sc.next().charAt(0);
        if (answer == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Bank(id, name, initialDeposit);
        }
        else {
            account = new Bank(id, name);
        }
        System.out.println(account.toString("new"));

        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.println(account.toString("updt"));

        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println(account.toString("updt"));

        sc.close();
    }
}
