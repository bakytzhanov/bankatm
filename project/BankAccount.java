package bit.raushan.project;

public interface BankAccount {
    String getAccountNumber();
    String getPinCode();
    void setPinCode(String pinCode);
    int totalBalance();
    void creditBalance(int credit);
    void debitBalance(int debit);
    String accountData();

    String getType();
}
