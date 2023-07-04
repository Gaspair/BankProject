//package client;
//
//
//import account.ClientAccount;
//import org.jetbrains.annotations.NotNull;
//
//import java.util.List;
//import java.util.UUID;
//
//public class Client implements IClient {
//
//    private String email;
//    private ClientAccount account;
//
//    private UUID clientId;
//    private String firstName;
//    private UUID bankCode;
//    private List<ClientAccount> listOfClientAccounts;
//
//
//    public Client(String firstName, double funds) {
//        this.clientId = UUID.randomUUID();
//        setClientName(firstName);
//        this.account = new ClientAccount(funds);
//    }
//
//
//
//    public ClientAccount getClientAccount() {
//        return account;
//    }
//
//    public UUID getClientId() {
//        return clientId;
//    }
//
//    public void setBankCode(UUID bankCode) {
//        this.bankCode = bankCode;
//    }
//
//    public UUID getBankCode() {
//        return bankCode;
//    }
//
//    public String getClientName() {
//        return firstName;
//    }
//
//    public void setClientName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public void transferFunds(double amount, @NotNull Client receiverClient) {
//        if (getBankCode() == receiverClient.getBankCode() && this.getClientAccount().getAccountId() != receiverClient.getClientAccount().getAccountId()) {
//            this.getClientAccount().transferFunds(amount, receiverClient.getClientAccount());
//        }
//        System.out.println(account.getFunds() + " ********** " + receiverClient.getClientAccount().getFunds());
//
//    }
//
//    @Override
//    public void checkFunds() {
//
//    }
//
//
//}
