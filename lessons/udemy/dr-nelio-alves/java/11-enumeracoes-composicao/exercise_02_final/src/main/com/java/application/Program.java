package main.com.java.application;

import main.com.java.model.entities.Client;
import main.com.java.model.entities.OrderItem;
import main.com.java.model.entities.Product;
import main.com.java.model.entities.Order;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.next();
        System.out.print("Enter e-mail: ");
        sc.nextLine();
        String email = sc.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        sc.nextLine();
        String birth = sc.next();
        Client client = new Client(name, email, LocalDate.parse(birth));

        System.out.println("Enter the order data: ");
        System.out.print("Status: ");
        sc.nextLine();
        String orderStatus = sc.next();

        System.out.print("How many items to this order? ");
        int n = sc.nextInt();

        ArrayList<OrderItem> item = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter the #%d item data:\n", i+1);
            System.out.print("Product name: ");
            name = sc.next();
            System.out.print("Product price: ");
            Double price = sc.nextDouble();
            System.out.println("Quantity: ");
            int quantity = sc.nextInt();
            Product product = new Product(name, price);
            item.add(quantity, product);
        }

        Order order = new Order();
        order.addItem(item);

        sc.close();
    }
}
