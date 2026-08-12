public abstract class Account {

    private long accountNumber;
    private double balance;
    private boolean active;

    private Customer owner;
    private AccountType accountType;

    public Account(long accountNumber,
                   double balance,
                   boolean active,
                   Customer owner,
                   AccountType accountType) {

        this.accountNumber = accountNumber;
        this.balance = balance;
        this.active = active;
        this.owner = owner;
        this.accountType = accountType;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean getActiveStatus() {
        return active;
    }

    public void setActiveStatus(boolean active) {
        this.active = active;
    }

    public Customer getOwner() {
        return owner;
    }

    public AccountType getAccountType() {
        return accountType;
    }
}