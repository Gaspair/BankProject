package controller;

import bank.Bank;
import client.Client;

import java.util.*;


public class Controller {

    List<Bank> banksList = new ArrayList<>();
    Bank lloydsBank;
    Bank raifaissenBank;
    Bank unionBank;

    public void initBanks(){
         lloydsBank = new Bank("LLoydsBank");
         raifaissenBank = new Bank("RaifaissenBank");
         unionBank = new Bank("UnionBank");

        banksList.add(lloydsBank);
        banksList.add(raifaissenBank);
        banksList.add(unionBank);
    }

    public void  newCustomer(String firstName, double funds, int bankCode){
        Client client = new Client(firstName,funds);
        banksList.get(bankCode);



    }
}
