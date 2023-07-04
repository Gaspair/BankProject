
import account.ClientAccount;


import bank.BankRefactored;
import client.ClientRefactored;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        BankRefactored bank1 = new BankRefactored("Lloyds");
        BankRefactored bank2 = new BankRefactored("Raifaissen");

        ClientRefactored client1 = new ClientRefactored("Dragos", "Baluta", 1000, "test@email.com", bank1);
        ClientRefactored client2 = new ClientRefactored("Andrei", "Panturu", 1500, "test@email.com", bank2);

        client1.createNewAccount(150,bank1);
        client1.createNewAccount(3000,bank1);
        client1.createNewAccount(45000,bank1);
//        client1.getAccount().transferFunds(100, client2.getAccount());






//        new MyFrame();


    }
}
