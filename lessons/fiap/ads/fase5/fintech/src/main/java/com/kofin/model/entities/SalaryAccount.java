package main.java.com.kofin.model.entities;

import main.java.com.kofin.model.enums.AccountType;
import java.time.LocalDateTime;

public class SalaryAccount extends Accounts {
    private String employer;

    public SalaryAccount() {
        super();
        super.setType(AccountType.SALARY);
    }

    public SalaryAccount(Integer id, String name, Integer number, Double balance, LocalDateTime creationDate, String employer) {
        super(id, name, AccountType.SALARY, number, balance, creationDate);
        this.employer = employer;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("\nEmployer: ").append(employer);
        return sb.toString();
    }
}
