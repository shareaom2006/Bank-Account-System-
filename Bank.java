import Account.Account;
import java.util.HashMap;
import java.util.Map;

public class Bank {
    private Map<String, Account> accounts = new HashMap<>();

    public void createAccount(String accountNumber, double initialBalance) {
        if (!accounts.containsKey(accountNumber)) {
            Account newAccount = new Account(accountNumber, initialBalance);
            accounts.put(accountNumber, newAccount);
            System.out.println("Account Created Successfully.");
        } else {
            System.out.println("Account number already exists!");
        }
    }

    public Account getAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }
}