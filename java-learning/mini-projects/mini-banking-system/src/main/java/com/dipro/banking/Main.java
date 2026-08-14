public class Main {

    public static void main(String[] args) {

        System.out.println("===== MINI BANKING SYSTEM TEST =====");


        CustomerService customerService = new CustomerService();
        AccountService accountService = new AccountService();

        TransactionService transactionService =
                new TransactionService(accountService);



        Customer customer1 = new Customer();
        customer1.setCustomerId(1001);

        Customer customer2 = new Customer();
        customer2.setCustomerId(1002);

        System.out.println("\n--- Customer Tests ---");

        System.out.println(
                "Add Customer 1: "
                        + customerService.addCustomer(customer1)
        );

        System.out.println(
                "Add Customer 2: "
                        + customerService.addCustomer(customer2)
        );

        System.out.println(
                "Add Customer 1 Again: "
                        + customerService.addCustomer(customer1)
        );

        SavingsAccount savings = new SavingsAccount(
                100001L,
                10000.0,
                true,
                customer1,
                AccountType.SAVINGS,
                5.0
        );

        CurrentAccount current = new CurrentAccount(
                100002L,
                5000.0,
                true,
                customer2,
                AccountType.CURRENT,
                2000.0
        );

        Account account1 = savings;
        Account account2 = current;

        System.out.println("\n--- Account Tests ---");

        System.out.println(
                "Create Account 1: "
                        + accountService.createAccount(account1)
        );

        System.out.println(
                "Create Account 2: "
                        + accountService.createAccount(account2)
        );

        System.out.println(
                "Create Account 1 Again: "
                        + accountService.createAccount(account1)
        );


        System.out.println("\n--- Initial Balances ---");

        System.out.println(
                "Account 100001: ₹" + account1.getBalance()
        );

        System.out.println(
                "Account 100002: ₹" + account2.getBalance()
        );


        System.out.println("\n--- Find Account Tests ---");

        System.out.println(
                "Find 100001: "
                        + (accountService.findAccount(100001L) != null)
        );

        System.out.println(
                "Find 999999: "
                        + (accountService.findAccount(999999L) != null)
        );



        System.out.println("\n--- Deposit Tests ---");

        boolean result = accountService.deposit(100001L, 2000.0);

        System.out.println("Deposit ₹2000: " + result);
        System.out.println(
                "New Balance: ₹" + account1.getBalance()
        );


        result = accountService.deposit(100001L, -500.0);

        System.out.println("Deposit -₹500: " + result);


        result = accountService.deposit(100001L, 0.0);

        System.out.println("Deposit ₹0: " + result);


        System.out.println("\n--- Withdrawal Tests ---");

        result = accountService.withdraw(100001L, 2000.0);

        System.out.println("Withdraw ₹2000: " + result);
        System.out.println(
                "New Balance: ₹" + account1.getBalance()
        );

        result = accountService.withdraw(100001L, 50000.0);

        System.out.println(
                "Withdraw ₹50000: " + result
        );

        System.out.println(
                "Balance After Failed Withdrawal: ₹"
                        + account1.getBalance()
        );




        System.out.println("\n--- Successful Transfer ---");

        result = transactionService.transfer(
                100001L,
                100002L,
                2000.0
        );

        System.out.println("Transfer ₹2000: " + result);

        System.out.println(
                "Account 1: ₹" + account1.getBalance()
        );

        System.out.println(
                "Account 2: ₹" + account2.getBalance()
        );


        System.out.println("\n--- Insufficient Transfer ---");

        result = transactionService.transfer(
                100001L,
                100002L,
                50000.0
        );

        System.out.println(
                "Transfer ₹50000: " + result
        );

        System.out.println(
                "Account 1: ₹" + account1.getBalance()
        );

        System.out.println(
                "Account 2: ₹" + account2.getBalance()
        );


        System.out.println("\n--- Invalid Transfer Amount ---");

        result = transactionService.transfer(
                100001L,
                100002L,
                -100.0
        );

        System.out.println(
                "Transfer -₹100: " + result
        );



        System.out.println("\n--- Self Transfer ---");

        result = transactionService.transfer(
                100001L,
                100001L,
                1000.0
        );

        System.out.println(
                "Self Transfer: " + result
        );


        System.out.println("\n--- Nonexistent Account ---");

        result = transactionService.transfer(
                999999L,
                100002L,
                1000.0
        );

        System.out.println(
                "Transfer From Nonexistent Account: "
                        + result
        );

        System.out.println("\n--- Close Account ---");

        result = accountService.closeAccount(100002L);

        System.out.println(
                "Close Account 100002: " + result
        );

        System.out.println(
                "Account 100002 Active: "
                        + account2.getActiveStatus()
        );

        System.out.println("\n--- Closed Account Transfer ---");

        double balanceBefore =
                account1.getBalance();

        result = transactionService.transfer(
                100001L,
                100002L,
                1000.0
        );

        System.out.println(
                "Transfer To Closed Account: " + result
        );

        System.out.println(
                "Sender Balance Before: ₹"
                        + balanceBefore
        );

        System.out.println(
                "Sender Balance After: ₹"
                        + account1.getBalance()
        );


        System.out.println("\n===== FINAL STATE =====");

        System.out.println(
                "Account 100001: ₹"
                        + account1.getBalance()
        );

        System.out.println(
                "Account 100002: ₹"
                        + account2.getBalance()
        );

        System.out.println(
                "Account 100001 Active: "
                        + account1.getActiveStatus()
        );

        System.out.println(
                "Account 100002 Active: "
                        + account2.getActiveStatus()
        );

        System.out.println("\n--- Account Type Tests ---");

        System.out.println(
                "Savings Interest: ₹" + savings.calculateInterest()
        );

        System.out.println(
                "Current Interest: ₹" + current.calculateInterest()
        );

        System.out.println("\n===== TEST COMPLETE =====");
    }
}