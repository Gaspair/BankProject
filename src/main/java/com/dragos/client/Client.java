package com.dragos.client;

import com.dragos.Controller;
import com.dragos.DatabaseConnection;
import com.dragos.account.Account;

public class Client {
    private String firstName;
    private String lastName;
    private String clientEmail;

    private String clientPassword;
    private Account clientAccount;





    String dbUrl = "jdbc:mysql://localhost:3306/bankproject";
    String user = "student";
    String pass = "student";


    DatabaseConnection databaseConnection = new DatabaseConnection(dbUrl, user, pass);
    Controller controller = new Controller(databaseConnection);


    public Client(String firstName,String lastName,String clientEmail,String clientPassword, double funds){
        this.firstName = firstName;
        this.lastName = lastName;
        this.clientEmail = clientEmail;
        this.clientPassword = clientPassword;
        this.clientAccount = new Account(funds);
        controller.insertClient(this);
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
