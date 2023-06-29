package Person;

public class Client implements IClient {
    String name;
    int clientID;
    double euroSold;
    double dollarSold;
    double ronSold;

    public Client(String name, int clientID, double euroSold, double dollarSold, double ronSold) {
        this.name = name;
        this.clientID = clientID;
        this.euroSold = euroSold;
        this.dollarSold = dollarSold;
        this.ronSold = ronSold;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public double getEuroSold() {
        return euroSold;
    }

    public void setEuroSold(double euroSold) {
        this.euroSold = euroSold;
    }

    public double getDollarSold() {
        return dollarSold;
    }

    public void setDollarSold(double dollarSold) {
        this.dollarSold = dollarSold;
    }

    public double getRonSold() {
        return ronSold;
    }

    public void setRonSold(double ronSold) {
        this.ronSold = ronSold;
    }
}
