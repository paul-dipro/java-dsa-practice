public class TransactionService {

    private final AccountService accountService;

    public TransactionService(AccountService accountService) {
        this.accountService = accountService;
    }

    public boolean transfer(long fromAccountNumber,
                            long toAccountNumber,
                            double amount) {


        if (fromAccountNumber <= 0 || toAccountNumber <= 0) {
            return false;
        }

        Account fromAccount = accountService.findAccount(fromAccountNumber);
        Account toAccount = accountService.findAccount(toAccountNumber);

        if (fromAccount == null || toAccount == null) {
            return false;
        }

        if (!fromAccount.getActiveStatus() || !toAccount.getActiveStatus()) {
            return false;
        }

        if(amount <= 0) {
            return false;
        }


        boolean withdrawResult = accountService.withdraw(fromAccountNumber, amount);
        if(!withdrawResult) {
            return false;
        }

        boolean depositResult = accountService.deposit(toAccountNumber, amount);
        if(!depositResult) {
            accountService.deposit(fromAccountNumber, amount);
            return false;
        }

        return true;

    }
}