import account.Account;
import bank.Bank;
import client.Client;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bank bank1 = new Bank("LLoydsBank");
        Bank bank2 = new Bank("RaifaissenBank");
        Bank bank3 = new Bank("UnionBank");

        Client client1 = new Client("Andrew", 100);
        Client client2 = new Client("Dragos", 152);
        Client client3 = new Client("Mathew", 112);

        bank1.setAccountsList(client1);
        bank1.setAccountsList(client2);


        System.out.println(bank1.getBankCode());
        System.out.println(client1.getBankCode());




    }
}
