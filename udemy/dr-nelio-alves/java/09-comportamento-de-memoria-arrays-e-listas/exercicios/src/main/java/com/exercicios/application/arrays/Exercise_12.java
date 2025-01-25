package main.java.com.exercicios.application.arrays;

import main.java.com.exercicios.entities.TripStudent;

import java.util.Scanner;

public class Exercise_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        TripStudent[] rooms = new TripStudent[10];
        for (int i = 0; i < n; i++) {
            System.out.println("\nRent #" + (i+1) + ":");
            System.out.print("Name: ");
            String name = sc.next() + " " + sc.next();
            sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Room: ");
            int room = sc.nextInt();
            rooms[room] = new TripStudent(room, name, email);
        }

        for (int i = 0; i < 9; i++) {
            if (rooms[i] != null) {
                System.out.print(rooms[i].toString());
            }
        }

        sc.close();
    }
}
