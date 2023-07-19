package com.dragos.bank;

import com.dragos.service.SignUpInterface;
import com.dragos.service.SignUpInterfaceImpl;

import java.util.HashMap;


public class HashMapOfBanks {
    static final   HashMap<String, Bank> bankHashMap;

    public static void addNewBank(Bank bank){
        bankHashMap.put(bank.getName(), bank);
    }
    public static HashMap<String, Bank> getBankHashMap() {
        return bankHashMap;
    }


    static {
        bankHashMap = new HashMap<>();

        // Create banks
        Bank bank3 = new Bank("Lloyds");
        Bank bank2 = new Bank("Raifaissen");
        Bank bank1 = new Bank("Monzo");

        // Add banks to the map
        addNewBank(bank1);
        addNewBank(bank2);
        addNewBank(bank3);

//        Register register = new Register();

        // Retrieve bank names from the map
        String bankName1 = bank1.getName();
        String bankName2 = bank2.getName();
        String bankName3 = bank3.getName();
        SignUpInterface signupInterface = new SignUpInterfaceImpl();
        // Register clients
        signupInterface.singUpClient(bankName1, "Dragos", "Baluta", "test1@gmail.com", "test123", 1001);
        signupInterface.singUpClient(bankName1, "Ana", "Rusu", "test2@gmail.com", "test123", 1002);

        signupInterface.singUpClient(bankName2, "Mihai", "Eminescu", "test3@gmail.com", "test123", 1003);
        signupInterface.singUpClient(bankName2, "Ana", "Rusu", "test4@gmail.com", "test123", 1004);

        signupInterface.singUpClient(bankName3, "Mircea", "Eliade", "test5@gmail.com", "test123", 1005);
        signupInterface.singUpClient(bankName3, "Ana", "Aslan", "test6@gmail.com", "test123", 1006);
    }




}
