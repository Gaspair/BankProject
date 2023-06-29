package client;


import account.Account;

import java.util.UUID;

public class Client implements IClient {

    private final Account account;

    private UUID clientId;
    private String clientName;


    public Client(String clientName,double funds, String accountType) {
        this.clientId = UUID.randomUUID();
        setClientName(clientName);
        this.account = new Account(funds,accountType);
    }

    public Account getClientAccount() {
        return account;
    }

    public void setClientId(UUID clientId) {
        this.clientId = clientId;
    }


    public UUID getClientId() {
        return clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }


}
