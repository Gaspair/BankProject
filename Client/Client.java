package Client;

import java.util.UUID;

public class Client implements IClient {

    UUID clientId;
    String clientName;
    double funds;

    public Client(String clientName, double funds) {
        this.clientId = UUID.randomUUID();
        setClientName(clientName);
        setFunds(funds);
    }

    public void setClientId(UUID clientId) {
        this.clientId = clientId;
    }

    public double getFunds() {
        return funds;
    }

    public void setFunds(double funds) {
        this.funds = funds;
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

    public void depositFunds(double amount){
        setFunds(amount+getFunds());
    }

    public void withdrawFunds(double amount){
        setFunds(getFunds()-amount);
    }

    public void transferFunds(double amount, Client receiver){
        this.setFunds(getFunds() - amount);
        receiver.setFunds(receiver.getFunds() + amount);
    }
}
