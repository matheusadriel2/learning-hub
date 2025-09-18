package main.java.com.kofin.model.entities;

import main.java.com.kofin.model.enums.AccountType;
import java.time.LocalDateTime;

public class SavingsAccount extends Accounts {
    private double interestRate;

    public SavingsAccount() {
        super();
        super.setType(AccountType.SAVINGS);
    }

    public SavingsAccount(Integer id, String name, Integer number, Double balance, LocalDateTime creationDate, double interestRate) {
        super(id, name, AccountType.SAVINGS, number, balance, creationDate);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interestAmount = getBalance() * interestRate;
        addBalance(interestAmount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("\nInterest Rate: ").append(String.format("%.2f", interestRate * 100)).append("%");
        return sb.toString();
    }
}
