package main.java.exercises;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if (n <= 1) {
            System.out.println("Invalid.");
        } else {
            boolean prime = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                System.out.println("Prime number.");
            } else {
                System.out.println("Not a prime number.");
            }
        }



        sc.close();
    }
}
