public class BankAccount {
    private int accountNumber;
    private double balance;
    private String holder;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getHolder() {
        return holder;
    }
}

