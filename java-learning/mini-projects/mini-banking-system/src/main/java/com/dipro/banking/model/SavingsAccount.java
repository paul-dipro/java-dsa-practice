public class SavingsAccount extends Account{
    private double interestRate;

    public SavingsAccount(long accountNumber,
                          double balance,
                          boolean active,
                          Customer owner,
                          AccountType accountType,
                          double interestRate) {

        super(accountNumber, balance, active, owner, accountType);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate / 100;
    }
}