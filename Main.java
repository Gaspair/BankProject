import bank.Bank;
import client.Client;

public class Main {
    public static void main(String[] args) {

        Client client1 = new Client("Andrew", 100,"personal account");
        Client client2 = new Client("Andrew", 100,"personal account");

        System.out.println(client1.getClientAccount().transferFunds(100,client2.getClientAccount()));



        System.out.println(client1.getClientAccount().depositFunds(100));
        System.out.println(client2.getClientAccount().getFunds());


        Bank bank1 = new Bank("LLoydsBank", 183.12);
        Bank bank2 = new Bank("RaifaissenBank", 13.12);
        Bank bank3 = new Bank("UnionBank", 1163.82);



    }
}
