package main.java.com.kofin.model;

import main.java.com.kofin.model.entities.Accounts;
import main.java.com.kofin.model.enums.AccountType;
import java.time.LocalDateTime;

public class KofinApp {

    public static void main(String[] args) {
        Accounts account1 = new Accounts(1, "Matheus", AccountType.CURRENT, 0001, 1.000, LocalDateTime.now());
        account1.addBalance(9.000);
        account1.withdraw(5.000);
    }
}
