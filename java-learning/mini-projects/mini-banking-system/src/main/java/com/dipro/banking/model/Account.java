public abstract class Account {

    private long accountNumber;
    private double balance;
    private boolean active;

    private Customer owner;
    private AccountType accountType;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}