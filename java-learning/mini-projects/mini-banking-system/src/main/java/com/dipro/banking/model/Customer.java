import java.util.ArrayList;
import java.util.List;

public class Customer {

    private int customerId;

    private final List<Account> accounts = new ArrayList<>();

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public List<Account> getAccounts() {
        return accounts;
    }
}