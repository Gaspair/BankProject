import Bank.Bank;
import Person.Client;

import java.util.Dictionary;
import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
        Client firstClient = new Client("Andrei",123,38.5,128.5,286.29);
        Client secondClient = new Client("Dragos",234,381.5,12.5,86.12);
        Client thirdClient = new Client("Mihai",345,387.15,1828.5,286.58);

        Dictionary<Integer, Client> clientsList = new Hashtable<>();
        clientsList.put(firstClient.getClientID(),firstClient);
        clientsList.put(secondClient.getClientID(),secondClient);
        clientsList.put(thirdClient.getClientID(),thirdClient);
        Bank lloydsBank = new Bank("LloydsBank",987, (Dictionary<Integer, Client>) clientsList);


        System.out.println(lloydsBank.getClientsList());

    }
}
