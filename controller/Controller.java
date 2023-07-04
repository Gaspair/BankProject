//package controller;
//
//import bank.Bank;
//import client.Client;
//
//import javax.swing.*;
//import java.util.*;
//
//
//public class Controller {
//
//    static List<Bank> banksList = new ArrayList<>();
//    Bank lloydsBank;
//    Bank raifaissenBank;
//    Bank unionBank;
//
//    public void initBanks(){
//         lloydsBank = new Bank("LLoydsBank");
//         raifaissenBank = new Bank("RaifaissenBank");
//         unionBank = new Bank("UnionBank");
//
//        banksList.add(lloydsBank);
//        banksList.add(raifaissenBank);
//        banksList.add(unionBank);
//    }
//
//    public void  newCustomer(String firstName, double funds, int bankCode){
//        Client client = new Client(firstName,funds);
//        Bank selectedBank = banksList.get(bankCode);
//    }
//
//    public void loginCustomer(String name, String password){
//
//    }
//
//    public static String[] getBanksList() {
//        String[] bankNames = new String[banksList.size()];
//        for (int i = 0; i < banksList.size(); i++) {
//            bankNames[i] = banksList.get(i).getBankName();
//        }
//        return bankNames;
//    }
//
//}
