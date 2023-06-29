import Bank.Bank;
import Client.Client;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Client client1 = new Client("Andrew", 100);
        Client client2 = new Client("Dragos", 100);
        Client client3 = new Client("Mathew", 12.81);


        Bank bank1 = new Bank("LLoydsBank", 183.12);
        Bank bank2 = new Bank("RaifaissenBank", 13.12);
        Bank bank3 = new Bank("UnionBank", 1163.82);

        bank1.createList(client1);
        bank1.createList(client2);

        List<Client> clients = bank1.getClientList();
        List<String> clientNames = bank1.getClientNames();



        System.out.println(clientNames);


        System.out.println(bank1.getClientList());

    }
}
