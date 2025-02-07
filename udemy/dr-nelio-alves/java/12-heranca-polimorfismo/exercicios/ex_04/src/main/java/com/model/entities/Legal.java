package main.java.com.model.entities;

public class Legal extends Contributors {
    private int Employees;

    public Legal() {
        super();
    }

    public Legal(String name, Double anualIncome, int employees) {
        super(name, anualIncome);
        Employees = employees;
    }

    public int getEmployees() {
        return Employees;
    }

    public void setEmployees(int employees) {
        Employees = employees;
    }

    @Override
    public Double tax() {
        if (Employees < 10) {
            return  getAnualIncome() * 0.16;
        } else {
            return getAnualIncome() * 0.14;
        }
    }
}
