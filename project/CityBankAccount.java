package bit.raushan.project;

public class CityBankAccount implements BankAccount {
    private String name;
    private String surname;
    private int balance;
    private String accountNumber;
    private String pinCode;
    private String type;


    public CityBankAccount(String name, String surname, int balance, String accountNumber, String pinCode, String type) {
        this.name = name;
        this.surname = surname;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
        this.type = type;


    }

    public String getName() { return name;}

    public void setName(String name) { this.name = name;}

    public String getSurname() { return surname;}

    public void setSurname(String surname) {this.surname = surname;}

    public int getBalance() { return balance;}

    public void setBalance(int balance) {this.balance = balance;}

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getType() { return type; }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String getPinCode() {
        return pinCode;
    }

    @Override
    public void setPinCode(String pinCode) {this.pinCode=pinCode;    }

    @Override
    public int totalBalance() {
        return balance;
    }

    @Override
    public void creditBalance(int credit) {

    }

    @Override
    public void debitBalance(int debit) {System.out.println("деньги добавлены");  }

    @Override
    public String accountData() {
        return " CityBankAccount";
    }

    //@Override
    //public String toString() {
   //     return "CityBankAccount{" +
   //             "type='" + type + '\'' +
   //             '}';
    //}
}

