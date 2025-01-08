package br.com.alura.exercises;

import java.util.ArrayList;

public class Product {
    String name;
    double price;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public static void main(String[] args) {
        Product p1 = new Product("Pepsi", 9.0);
        Product p2 = new Product("Cola", 11.0);
        Product p3 = new Product("Monster", 12.0);

        ArrayList<Product> products = new ArrayList<>();
        products.add(p1);
        products.add(p2);
        products.add(p3);

        double sum = 0;

        for (Product product : products) {
            sum = sum + product.getPrice();
        }

        double avg = sum / products.size();
        for (Product product : products) {
            System.out.println(product.getName() + " " + product.getPrice());
        }

        System.out.printf("Average price: %.1f\n", avg);
    }
}
