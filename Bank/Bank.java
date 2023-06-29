package Bank;



import Client.Client;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Bank implements IBank {

    UUID bankCode;
    String bankName;
    double funds;
    private List<Client> clientList ;

    public Bank(String bankName, double funds) {
        this.bankCode = UUID.randomUUID();
        setBankName(bankName);
        clientList = new ArrayList<>();


    }

    public UUID getBankCode() {
        return bankCode;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public double getFunds() {
        return funds;
    }

    public void setFunds(double funds) {
        this.funds = funds;
    }

    public List<Client> getClientList() {
        List<Client> copyList = new ArrayList<>(clientList);
        return copyList;
    }
    public List<String> getClientNames() {
        List<String> clientNames = new ArrayList<>();
        for (Client client : clientList) {
            clientNames.add(client.getClientName());
        }
        return clientNames;
    }

    public void createList(Client client){
        clientList.add(client);
    }
}
