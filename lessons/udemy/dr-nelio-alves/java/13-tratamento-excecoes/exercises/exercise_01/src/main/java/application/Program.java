package main.java.application;

import main.java.model.entities.Account;
import main.java.model.exceptions.WithdrawException;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            System.out.print("Holder: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Initial balance: ");
            double initBal = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double limit = sc.nextDouble();
            Account acc = new Account(number, name, initBal, limit);

            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            double amount = sc.nextDouble();
            acc.withdraw(amount);

        } catch (WithdrawException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }

        sc.close();
    }
}
