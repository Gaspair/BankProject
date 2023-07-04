//package bank;
//
//
//import account.BankAccount;
//import account.ClientAccount;
//import client.Client;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.UUID;
//
//public class Bank implements IBank {
//
//    UUID bankCode;
//    String bankName;
//    double funds;
//
//    private BankAccount account;
//    List<ClientAccount> accountsList;
//
//    public Bank(){}
//
//
//    public Bank(String bankName) {
//        this.bankCode = UUID.randomUUID();
//        setBankName(bankName);
//        this.account = new BankAccount(funds);
//        accountsList = new ArrayList<>();
////        updateBankFunds();
//    }
//
//    public List<ClientAccount> getAccountsList() {
//        return accountsList;
//    }
//
//    public void setAccountsList(Client client) {
//
//        accountsList.add((ClientAccount) client.getClientAccount());
//        client.setBankCode(this.bankCode);
//    }
//
//    public void getBankById(UUID bankCode) {
//
//    }
//
//    public BankAccount getBankAccount() {
//        return account;
//    }
//
//    public UUID getBankCode() {
//        return bankCode;
//    }
//
//    public String getBankName() {
//        return bankName;
//    }
//
//    public void setBankName(String bankName) {
//        this.bankName = bankName;
//    }
//
//    public double getFunds() {
//        return funds;
//    }
//
//    public void setFunds(double funds) {
//        this.funds = funds;
//    }
//
//
//    public void updateBankFunds() {
//        double totalFunds = 0.0;
//        for (Account account : accountsList) {
//            totalFunds += account.getFunds();
//        }
//        setFunds(totalFunds);
//    }
//
//
//}
