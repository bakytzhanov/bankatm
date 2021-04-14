package bit.raushan.project;

public class NationalBankAccount implements BankAccount {
    private String fullName;
    private int balance;
    private String accountNumber;
    private String pinCode;
    private String type;




    public NationalBankAccount(String fullName, int balance, String accountNumber, String pinCode, String type) {
        this.fullName = fullName;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
        this.type = type;
    }

    public String getFullName() { return fullName; }

    public void setFullName(String fullName) {this.fullName = fullName;}

    public int getBalance() {return balance;}

    public void setBalance(int balance) {this.balance = balance;}

    public void setAccountNumber(String accountNumber) {this.accountNumber = accountNumber;}

    public String getType() {return type; }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getAccountNumber() {return accountNumber; }

    @Override
    public String getPinCode() {
        return pinCode;
    }

    @Override
    public void setPinCode(String pinCode) { this.pinCode = pinCode; }

    @Override
    public int totalBalance() {  return balance;  }

    @Override
    public void creditBalance(int credit) {this.balance = balance - credit;  }

    @Override
    public void debitBalance(int debit) {System.out.println("добавили денег");    }

    @Override
    public String accountData() {
        return "NationalBankAccount";
    }

   // @Override
   // public String toString() {return "NationalBankAccount{" +
  //              "type='" + type + '\'' +
  //              '}';
   // }
}
