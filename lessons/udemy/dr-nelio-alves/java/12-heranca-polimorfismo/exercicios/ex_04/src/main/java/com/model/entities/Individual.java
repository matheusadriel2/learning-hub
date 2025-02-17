package main.java.com.model.entities;

public class Individual extends Contributors {
    private Double healthExpenditures;

    public Individual() {
        super();
    }

    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double tax() {
        double incomeCalc = 0.0;
        if (getAnualIncome() < 20.000) {
            incomeCalc = getAnualIncome() * 0.15;
        } else {
            incomeCalc = getAnualIncome() * 0.25;
        }
        return incomeCalc - (healthExpenditures * 0.5);
    }
}
