package main.java.com.exercicios.util;

public class CurrencyConverter {
    public static double calc(double price, double amount) {
        return price * amount + (price * amount * 0.06);
    }
}
