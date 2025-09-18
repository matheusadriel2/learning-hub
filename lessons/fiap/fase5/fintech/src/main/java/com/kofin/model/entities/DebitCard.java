package main.java.com.kofin.model.entities;

import main.java.com.kofin.model.enums.CardType;
import java.time.LocalDate;

public class DebitCard extends Cards {
    private double dailyLimit;

    public DebitCard() {
        super();
        super.setType(CardType.DEBIT);
    }

    public DebitCard(Integer id, Integer number, LocalDate validity, String flag, LocalDate creationDate, LocalDate updateDate, double dailyLimit) {
        super(id, CardType.DEBIT, number, validity, flag, creationDate, updateDate);
        this.dailyLimit = dailyLimit;
    }

    public double getDailyLimit() {
        return dailyLimit;
    }

    public void setDailyLimit(double dailyLimit) {
        this.dailyLimit = dailyLimit;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("\nDaily Limit: ").append(String.format("%.2f", dailyLimit));
        return sb.toString();
    }
}
