package bank;

import account.BankAccount;
import account.ClientAccount;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class BankRefactored {
    private UUID bankCode;
    private String bankName;
    double funds;
    private BankAccount account;
    private HashMap< String,ClientAccount[]> clientAccountList;




    public BankRefactored(String bankName){
        this.bankCode = UUID.randomUUID();
        setBankName(bankName + "Bank");
        this.account = new BankAccount(funds);
        clientAccountList = new HashMap<String,ClientAccount[]>();
    }

    public UUID getBankCode() {
        return bankCode;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public double checkFunds() {
        return account.getFunds();
    }
}
