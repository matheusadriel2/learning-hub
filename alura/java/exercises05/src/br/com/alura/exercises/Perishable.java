package br.com.alura.exercises;

public class Perishable extends Product {
    int expirationDate;

    public Perishable(String name, double price, int quantity, int expirationDate) {
        super(name, price, quantity);
        this.expirationDate = expirationDate;
    }

    public int getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(int expirationDate) {
        this.expirationDate = expirationDate;
    }
}
