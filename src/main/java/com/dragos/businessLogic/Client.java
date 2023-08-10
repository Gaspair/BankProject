package businessLogic;

import com.dragos.businessLogic.Account;
import java.util.UUID;

public class Client {
    private int client_Id;
    private String firstName;
    private String lastName;
    private String clientEmail;
    private String clientPassword;
    private Account clientAccount;
    private int clientAccountId;


    public Client(String firstName, String lastName, String clientEmail, String clientPassword, double funds) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.clientEmail = clientEmail;
        this.clientPassword = clientPassword;
        this.clientAccount = new Account(funds);

    }


    public Client(int client_id,String firstName, String lastName, String clientEmail, Account account) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.clientEmail = clientEmail;
        this.client_Id = client_id;
        this.clientAccount=account;
    }

    public String getClientPassword() {
        return clientPassword;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public Account getClientAccount() {
        return clientAccount;
    }


}
