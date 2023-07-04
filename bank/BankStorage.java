package bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

public class BankStorage {

    static HashMap<UUID,BankRefactored> bankList = new HashMap<UUID,BankRefactored>();

    public static void addNewBank(BankRefactored bankRefactored){
        bankList.put(bankRefactored.getBankCode(),bankRefactored);
    }

    public static ArrayList<String> getBankList() {
        ArrayList<String> bankNames = new ArrayList<String>();
        for (BankRefactored element:bankList.values()) {
            bankNames.add(element.getBankName());
        }
        return bankNames;
    }
}
