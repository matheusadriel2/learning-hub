package main.java.com.exercises.entities;

public class Worker {
    private Integer id;
    private String name;
    private Double salary;

    public Worker() {
    }

    public Worker(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double salaryIncrease(double amount) {
        return salary + salary * amount % 100;
    }

    @Override
    public String toString() {
        return id + ", "
                + name + ", "
                + salary;
    }
}
