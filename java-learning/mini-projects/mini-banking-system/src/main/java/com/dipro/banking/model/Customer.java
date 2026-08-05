import java.util.ArrayList;
import java.util.List;

public class Customer {

    private int customerId;
    private Customer owner;
    private String phoneNumber;

    private List<Account> accounts = new ArrayList<>();

}