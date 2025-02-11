package main.java.exercises;

import java.util.Random;
import java.util.Scanner;

public class ViewAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insert the student name: ");
        String name = sc.nextLine();
        System.out.print("Insert the street name: ");
        String stName = sc.nextLine();
        System.out.print("Insert the number: ");
        int houseNumber = sc.nextInt();
        System.out.print("Insert the CEP (00000 000): ");
        sc.nextLine();
        String cep0 = sc.nextLine();
        Cep cep = new Cep(cep0);
        System.out.print("Insert your city: ");
        String city = sc.nextLine();
        System.out.print("Insert your state: ");
        String state = sc.nextLine();
        City city1 = new City(city, state);
        Random reg = new Random();
        Student st1 = new Student(name, new Address(stName, houseNumber, cep, city1), reg.nextInt(1000000000)+1);

        System.out.println();
        System.out.println(st1);

        sc.close();
    }
}
