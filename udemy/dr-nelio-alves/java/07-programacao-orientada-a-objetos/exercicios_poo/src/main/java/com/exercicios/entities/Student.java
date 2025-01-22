package main.java.com.exercicios.entities;

public class Student {
    public String name;
    public double firstGrade;
    public double secondGrade;
    public double thirdGrade;

    public double finalGrade() {
        return firstGrade + secondGrade + thirdGrade;
    }

    public void isApproved() {
        double finalGrade = finalGrade();
        if (finalGrade > 60) {
            System.out.println("PASS!");
        } else {
            System.out.printf("FAILED\nMISSING %.2f POINTS\n", 60 - finalGrade);
        }
    }
}
