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


        if (checkAccountAndPin(accountData, pinCode, bankAccount)) {
                if (checkAccountType(accountData, bankAccount) == true) {
                System.out.println("PRESS [1] TO CASH WITHDRAWAL");
                System.out.println("PRESS [2] TO VIEW BALANCE");
                System.out.println("PRESS [3] TO EXIT");
                int choice = scanner.nextInt();


            } else {

                System.out.println("PRESS [1] TO CASH WITHDRAWAL");
                System.out.println("PRESS [2] TO VIEW BALANCE");
                System.out.println("PRESS [3] TO CHANGE PIN CODE");
                System.out.println("PRESS [4] TO CASH IN ACCOUNT");
                System.out.println("PRESS [5] TO VIEW ACCOUNT DATA");
                System.out.println("PRESS [6] TO EXIT111");

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

    static boolean checkAccountType(String accountData, BankAccount[] bankAccounts) {
        //System.out.println(accountData.substring(0,2));
        String tp = accountData.substring(0,2);
        for (BankAccount client : bankAccounts) {

            if(tp.equals("CB")){
              //  System.out.println("true");
                return true;

            }else if(tp.equals("NB")){
               // System.out.println("false");
                return false;
            }else{
                //doing nothing
            }
           // if (client.getType().equals("CB")){ return true;}
           // else if (client.getType().equals("NB")){return false;}
          //  else{}
        }
        //return false;
        return false;
    }




    static boolean checkAccountAndPin(String accountData, String pinCode, BankAccount[] bankAccounts) {
        for (BankAccount client : bankAccounts) {
            if ((client.getAccountNumber().equals(accountData)) && (client.getPinCode().equals(pinCode))) return true;
            {
             //   System.out.println("true");
   //             else return false;
            }
        } return false;
    }


}
