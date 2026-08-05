import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CustomerService {

    private final Map<Integer, Customer> customers = new HashMap<>();

    public boolean addCustomer(Customer customer) {

        if (customer == null) {
            return false;
        }

        int customerId = customer.getCustomerId();

        if(customerId <= 0) {
            return false;
        }

        if (customers.containsKey(customerId)) {
            return false;
        }

        customers.put(customerId, customer);
        return true;
    }

    public Customer findCustomer(int customerId) {
       return customers.get(customerId);
    }

    public boolean deleteCustomer(int customerId) {
        return customers.remove(customerId) != null;
    }

    public boolean updateCustomer(Customer customer) {

        if(customer == null) {
            return false;
        }

        int customerId = customer.getCustomerId();

        if(customerId <= 0) {
            return false;
        }

        return customers.replace(customerId, customer) != null;

    }

    public Collection<Customer> getAllCustomers() {
        return customers.values();
    }
}