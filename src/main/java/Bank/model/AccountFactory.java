package Bank.model;

public interface AccountFactory {
    abstract BankAccount getAccount(String id, double balance, String accountName);
}
