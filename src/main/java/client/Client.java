package client;


import account.ClientAccount;
import bank.Bank;

import java.util.ArrayList;


public class Client {
    private String firstName;
    private String lastName;
    private String email;

    private ArrayList<ClientAccount> clientListOfAccounts = new ArrayList<ClientAccount>();

    public Client(String firstName, String lastName, double funds, String email, Bank bank) {
        setClientName(firstName, lastName);
        createNewAccount(funds, bank);
        this.email = email;

    }

    public void createNewAccount(double funds, Bank bank) {
        clientListOfAccounts.add(new ClientAccount(funds, bank.getBankCode()));
        bank.addToClientList(this);

    }

    public ArrayList<ClientAccount> getClientAccountList() {
        return clientListOfAccounts;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setClientName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Client Accounts: " + clientListOfAccounts.toString();
    }

//    public ClientAccount getAccount() {
//        return account;
//    }
}
