package main.java.exercises;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Multiplication Table:");
        System.out.println();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("#%d table: \n", i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i*j);
            }
            System.out.println();
        }
    }
}
