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

    public Collection<Account> getAllAccounts() {
        return accounts.values();
    }
}