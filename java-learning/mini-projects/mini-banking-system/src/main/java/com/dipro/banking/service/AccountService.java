import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


public class AccountService{

    private final Map<Long, Account> accounts = new HashMap<>();

    public boolean createAccount(Account account) {

        if (account == null) {
            return false;
        }

        long accountNumber = account.getAccountNumber();

        if(accountNumber <= 0) {
            return false;
        }

        if (accounts.containsKey(accountNumber)) {
            return false;
        }

        Customer owner = account.getOwner();

        if (owner == null) {
            return false;
        }

        accounts.put(accountNumber, account);
        owner.getAccounts().add(account);

        return true;

    }

    public Account findAccount(long accountNumber) {
        return accounts.get(accountNumber);
    }

    public boolean closeAccount(long accountNumber) {
        return accounts.remove(accountNumber) != null;
    }

    public boolean deposit(long accountNumber, double amount) {

        Account account = accounts.get(accountNumber);

        if (account == null) {
            return false;
        }

        if (accountNumber <= 0) {
            return false;
        }

        if(amount > 0) {
            double newBalance = account.getBalance();
            newBalance += amount;
            account.setBalance(newBalance);
            return true;
        } else {
            return false;
        }
    }

    public boolean withdraw(long accountNumber,  double amount) {

        Account account = accounts.get(accountNumber);

        if (account == null) {
            return false;
        }

        if (accountNumber <= 0) {
            return false;
        }

        if(account.getBalance() >= amount && amount > 0) {
            double newBalance = account.getBalance();
            newBalance -= amount;
            account.setBalance(newBalance);
        } else {
            return false;
        }
        return true;
    }

    public Collection<Account> getAllAccounts() {
        return accounts.values();
    }
}