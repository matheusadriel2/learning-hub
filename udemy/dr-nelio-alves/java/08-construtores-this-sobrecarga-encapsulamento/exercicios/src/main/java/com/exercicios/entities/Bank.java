package main.java.com.exercicios.entities;

public class Bank implements DataInfo {
    private int id;
    private String name;
    private double balance;

    public  Bank() {
    }

    public Bank(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        deposit(balance);
    }

    public Bank(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (this.balance > 0) {
            this.balance -= amount + 5.00;
        } else {
            System.out.println("Insufficient funds.");
        }

    }

    @Override
    public String toString(String use) {
        use = (use == "new") ? "Account" : "Updated";
        return use + " data: \n"
                + "Account " + id + ", "
                + "Holder: " + name + ", "
                + "Balance: " + String.format("%.2f", balance);


    }
}