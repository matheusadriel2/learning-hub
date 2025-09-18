package main.java.com.kofin.model.entities;

import main.java.com.kofin.model.enums.CardType;
import java.time.LocalDate;

public class CreditCard extends Cards {
    private double creditLimit;
    private double currentDebt;

    public CreditCard() {
        super();
        super.setType(CardType.CREDIT);
    }

    public CreditCard(Integer id, Integer number, LocalDate validity, String flag, LocalDate creationDate, LocalDate updateDate, double creditLimit, double currentDebt) {
        super(id, CardType.CREDIT, number, validity, flag, creationDate, updateDate);
        this.creditLimit = creditLimit;
        this.currentDebt = currentDebt;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public double getCurrentDebt() {
        return currentDebt;
    }

    public void setCurrentDebt(double currentDebt) {
        this.currentDebt = currentDebt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("\nCredit Limit: ").append(String.format("%.2f", creditLimit));
        sb.append("\nCurrent Debt: ").append(String.format("%.2f", currentDebt));
        return sb.toString();
    }
}
