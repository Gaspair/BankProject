package com.dragos.businessLogic;

import com.dragos.bank.HashMapOfBanks;
import com.dragos.client.Client;
import com.dragos.service.SignUpInterface;
import com.dragos.service.SignUpInterfaceImpl;

import javax.swing.*;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FormValidatorImpl implements FormValidatorInterface {
//   static Register register = new Register();
    static String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
    static Pattern pattern = Pattern.compile(regex);


    public  boolean formSignInValidator(String bankName, String email, String password) {
        Client client = HashMapOfBanks.getBankHashMap().get(bankName).getListOfClients().get(email);
        if (client != null) {
            String clientPassword = client.getClientPassword();
            if (Objects.equals(clientPassword, password)) {

                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect password!");

                return false;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Client not found!");

            return false;
        }
    }




    public  boolean formSignUpValidator(String bankName, String firstName, String lastName, String clientEmail, String password, double funds) {
        Matcher matcher = pattern.matcher(clientEmail);
        if(!matcher.matches()  ){
            JOptionPane.showMessageDialog(null, "Please enter a valid email address!");
            return false;
        } else if (HashMapOfBanks.getBankHashMap().get(bankName).getListOfClients().containsKey(clientEmail)) {
            JOptionPane.showMessageDialog(null, "Email already in use!");
            return false;
        } else{
            SignUpInterface signupInterface = new SignUpInterfaceImpl();
            signupInterface.singUpClient(bankName, firstName, lastName, clientEmail, password, funds);
            return true;
        }


    }
}
