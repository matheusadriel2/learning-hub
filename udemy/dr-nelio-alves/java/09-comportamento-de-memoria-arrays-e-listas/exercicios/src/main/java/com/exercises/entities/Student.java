package main.java.com.exercises.entities;

public class Student {
    private String name;
    private double firstGrade;
    private double secondGrade;

    public Student() {
    }

    public Student(String name, double firstGrade, double secondGrade) {
        this.name = name;
        this.firstGrade = firstGrade;
        this.secondGrade = secondGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFirstGrade() {
        return firstGrade;
    }

    public void setFirstGrade(double firstGrade) {
        this.firstGrade = firstGrade;
    }

    public double getSecondGrade() {
        return secondGrade;
    }

    public void setSecondGrade(double secondGrade) {
        this.secondGrade = secondGrade;
    }

    public void isApproved() {
        double avg = (firstGrade + secondGrade) / 2;
        if (avg >= 6.0) {
            System.out.println(name);
        }
    }

}
