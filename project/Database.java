package bit.raushan.project;

public class Database {
    public static BankAccount bankAccounts[] = new BankAccount[5];
    static{
        bankAccounts[0] = new CityBankAccount("Raushan","Raushan",20000,"CB01","1111", "CB" );
        bankAccounts[1] = new CityBankAccount("Nazym","Nazym",30000,"CB02", "2222", "CB");
        bankAccounts[2] = new NationalBankAccount("Ilyas Ilyas", 40000,"NB03", "3333", "NB");
        bankAccounts[3] = new NationalBankAccount("Akerke Akerke", 50000,"NB04", "4444", "NB");
        bankAccounts[4] = new NationalBankAccount("Akbope Akbope", 60000,"NB05", "5555", "NB");

    }

}
