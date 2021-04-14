package bit.raushan.project;

import java.util.Scanner;

public class CityBankATM {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BankAccount[] bankAccount = Database.bankAccounts;
        System.out.println("введите номер счёта");
        String accountData = scanner.next();
        System.out.println("введите  пин код");
        String pinCode = scanner.next();

        String accnum;
     //   checkAccountAndPin(accountData, pinCode, bankAccount);
 //       checkAccountType(bankAccount);

        if (checkAccountAndPin(accountData, pinCode, bankAccount)) {
           // accnum =
          //  if (checkAccountType(bankAccount) == 0) {
                if (checkAccountType(bankAccount) == true) {
                System.out.println("PRESS [1] TO CASH WITHDRAWAL");
                System.out.println("PRESS [2] TO VIEW BALANCE");
                System.out.println("PRESS [3] TO EXIT");
                int choice = scanner.nextInt();

//использовать методы с udemy.lambda.StudentInfo
//                smallMenuChoiceSelector();
            } else {
               //    b1 = checkAccountType(bankAccount);
                System.out.println("PRESS [1] TO CASH WITHDRAWAL");
                System.out.println("PRESS [2] TO VIEW BALANCE");
                System.out.println("PRESS [3] TO CHANGE PIN CODE");
                System.out.println("PRESS [4] TO CASH IN ACCOUNT");
                System.out.println("PRESS [5] TO VIEW ACCOUNT DATA");
                System.out.println("PRESS [6] TO EXIT");
                  //  System.out.println(b1);
                int choice = scanner.nextInt();


            }
        }

    }

    static void withdrawal(int sum, String account, BankAccount[] accounts) {
        for (BankAccount client : accounts) {
            if (client.getAccountNumber().equals(account)) {
                client.creditBalance(sum);
            }
        }
    }

    static void smallMenuChoiceSelector(int choice, String account, BankAccount[] accounts) {
        Scanner scanner = new Scanner(System.in);
        if (choice == 1) {
            System.out.println("сколько снять?");
            int sum = scanner.nextInt();
            withdrawal(sum, account, accounts);
            //int sum = scanner.nextInt();
            //метод который вычтет из баланса введёггую сумму
        } else if (choice == 2) {

        } else System.out.println("exit");
    }

    static boolean checkAccountType(BankAccount[] bankAccounts) {

        for (BankAccount client : bankAccounts) {

            if (client.getType().equals("CB")){ return true;}
            else if (client.getType().equals("NB")){return false;}
        }

    }




    static boolean checkAccountAndPin(String accountData, String pinCode, BankAccount[] bankAccounts) {
        for (BankAccount client : bankAccounts) {
            if ((client.getAccountNumber().equals(accountData)) && (client.getPinCode().equals(pinCode))) return true;
            {
   //             else return false;
            }
        } return false;
    }


}
