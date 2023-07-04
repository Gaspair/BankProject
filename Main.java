
import account.ClientAccount;


import bank.BankRefactored;
import bank.BankStorage;
import client.ClientRefactored;
import gui.MyFrame;


import java.util.List;

public class Main {

    public static void main(String[] args) {
        BankRefactored bank1 = new BankRefactored("Lloyds");
        BankRefactored bank2 = new BankRefactored("Raifaissen");
        BankRefactored bank3 = new BankRefactored("Chase");
        BankRefactored bank4 = new BankRefactored("Monzo");
        BankRefactored bank5 = new BankRefactored("JPMorgan");
        BankRefactored bank6 = new BankRefactored("BRD");

        ClientRefactored client1 = new ClientRefactored("Dragos", "Baluta", 1000, "test@email.com", bank1);
        ClientRefactored client2 = new ClientRefactored("Andrei", "Panturu", 1500, "test@email.com", bank2);


        new MyFrame();



        System.out.println( BankStorage.getBankList());
    }

}
