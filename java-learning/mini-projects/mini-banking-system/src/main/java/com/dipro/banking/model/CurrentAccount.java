public class CurrentAccount extends Account{
    private double overdraftLimit;

    public CurrentAccount(long accountNumber,
                          double balance,
                          boolean active,
                          Customer owner,
                          AccountType accountType,
                          double overdraftLimit) {

        super(accountNumber, balance, active, owner, accountType);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public double calculateInterest() {
        return 0;
    }
}