package main.java.com.kofin.model.entities;

import main.java.com.kofin.model.enums.Verified;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Users {
    private Integer id;
    private Accounts acc;
    private Cards card;
    private Transactions transactions;
    private String firstName;
    private String lastName;
    private String email;
    private Double balance;
    private Verified isVerified;
    private Boolean isActive;
    private LocalDateTime creationDate;
    private LocalDateTime updateDate;

    public Users() {
    }

    public Users(Integer id, Accounts acc, Cards card, Transactions transactions, String firstName, String lastName, String email, Double balance, Verified isVerified, boolean isActive, LocalDateTime creationDate, LocalDateTime updateDate) {
        this.id = id;
        this.acc = acc;
        this.card = card;
        this.transactions = transactions;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.balance = balance;
        this.isVerified = isVerified;
        this.isActive = isActive;
        this.creationDate = creationDate;
        this.updateDate = updateDate;
    }

    // Getters e Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Accounts getAcc() {
        return acc;
    }

    public void setAcc(Accounts acc) {
        this.acc = acc;
    }

    public Cards getCard() {
        return card;
    }

    public void setCard(Cards card) {
        this.card = card;
    }

    public Transactions getTransactions() {
        return transactions;
    }

    public void setTransactions(Transactions transactions) {
        this.transactions = transactions;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Verified getIsVerified() {
        return isVerified;
    }

    public void setIsVerified(Verified isVerified) {
        this.isVerified = isVerified;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }

    public LocalDateTime updateInfoDate() {
        LocalDateTime newDate = LocalDateTime.now();
        return this.updateDate = LocalDateTime.parse(newDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
    }

    public void updateFirstName(String firstName) {
        this.firstName = firstName;
        System.out.println("Updated successfully");
        updateInfoDate();
    }

    public void updateLastName(String lastName) {
        this.lastName = lastName;
        System.out.println("Updated successfully");
        updateInfoDate();
    }

    public void updateEmail(String email) {
        this.email = email;
        System.out.println("Updated successfully");
        updateInfoDate();
    }

    public void isActive(boolean status) {
        this.isActive = status;
        if (isActive) {
            System.out.println("Active account");
        } else {
            System.out.println("Disabled");
        }
    }

}