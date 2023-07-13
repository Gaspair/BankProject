package bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

public class BankStorage {

    static HashMap<UUID, Bank> bankList = new HashMap<UUID, Bank>();

    public static void addNewBank(Bank bank){
        bankList.put(bank.getBankCode(), bank);
    }

    public static ArrayList<String> getBankList() {
        ArrayList<String> bankNames = new ArrayList<String>();
        for (Bank element:bankList.values()) {
            bankNames.add(element.getBankName());
        }
        return bankNames;
    }
}
