package Bank;

import Person.Client;

import java.util.Dictionary;
import java.util.Hashtable;

public class Bank implements IBank {
    String name;
    int bankID;
    double euroSold;
    double dollarSold;
    double ronSold;

    Dictionary<Integer, Client> clientsList = new Hashtable<>();


    @Override
    public void transferMoneyBank() {

    }

    @Override
    public void transferMoneyPerson() {

    }

    public Bank(String name, int bankID, Dictionary<Integer, Client> clientsList) {
        this.name = name;
        this.bankID = bankID;
        this.clientsList = (Dictionary<Integer, Client>) clientsList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBankID() {
        return bankID;
    }

    public void setBankID(int bankID) {
        this.bankID = bankID;
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

    public Dictionary<Integer, Client> getClientsList() {
        return clientsList;
    }

    public void setClientsList(Dictionary<Integer, Client> clientsList) {
        this.clientsList = clientsList;
    }
}
