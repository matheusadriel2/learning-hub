package main.java.exercises;

public class Product {
    private String name;
    private Double price;
    private Integer quantity;

    public Product() {
    }

    public Product(String name, Double price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void information() {
        System.out.printf("Product: %s, R$%.2f\nQuantity: %d", name, price, quantity);
    }

    public void purchased(int quantity) {
        if (quantity <= this.quantity) {
            this.quantity -= quantity;
        } else {
            System.out.println("Not enough items in storage.");
        }
    }

    public void increaseStorage(int quantity) {
        this.quantity += quantity;
    }

    public double discount(double percent) {
        return price = price * (percent/100);
    }
}
