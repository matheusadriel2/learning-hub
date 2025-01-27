package main.java.com.exercises.entities;

public class Employee {
    public String Name;
    public double GrossSalary;
    public double Tax;

    public double NetSalary() {
        return GrossSalary - Tax;
    }

    public void IncreaseSalary(double percentage) {
        double og = this.GrossSalary;
        percentage *= 0.01;
        this.GrossSalary -= Tax;
        this.GrossSalary = GrossSalary + (og * percentage);
    }
}
