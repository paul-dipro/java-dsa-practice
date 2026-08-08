public abstract class Account {

    private long accountNumber;
    private double balance;
    private boolean active;

    private Customer owner;
    private AccountType accountType;

    public Account(boolean active, double balance) {
        this.active = active;
        this.balance = balance;
    }

    public boolean getActiveStatus() {
        return active;
    }

    public void setActiveStatus(boolean active) {
        this.active = active;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}