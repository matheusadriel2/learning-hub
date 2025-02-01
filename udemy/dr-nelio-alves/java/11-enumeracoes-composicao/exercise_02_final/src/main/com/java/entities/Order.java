package main.com.java.entities;

import main.com.java.entities.enums.OrderStatus;

import java.sql.Date;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Order {
    private Date moment;
    private OrderStatus status;
    ArrayList<OrderItem> items = new ArrayList<>();

    public static final DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    public Order() {
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public ArrayList<OrderItem> getItems() {
        return items;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    public Double total() {
        Double sum;
        for (OrderItem item : items) {
            sum += item.subTotal();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ORDER SUMMARY: \n");
        sb.append("Order moment: " +  fmt1.format(moment) + "\n");
        sb.append("Order status: " + getStatus() + "\n");
        sb.append(Client);
        sb.append("Order items: \n");
        sb.append("Comments:\n");
        for (Comment c : comments) {
            sb.append(c);
        }
        return sb.toString();
    }
}
