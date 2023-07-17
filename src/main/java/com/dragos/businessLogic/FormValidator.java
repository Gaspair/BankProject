package com.dragos.businessLogic;

import com.dragos.bank.HashMapOfBanks;
import com.dragos.gui.LoginPage;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FormValidator {
//   static Register register = new Register();
    static String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
    static Pattern pattern = Pattern.compile(regex);




    public static boolean formValidator(String bankName, String firstName, String lastName, String clientEmail, String password, double funds) {
           Matcher matcher = pattern.matcher(clientEmail);
        if(!matcher.matches()  ){
            JOptionPane.showMessageDialog(null, "Please enter a valid email address!");
            return false;
        } else if (HashMapOfBanks.getBankHashMap().get(bankName).getListOfClients().containsKey(clientEmail)) {
            JOptionPane.showMessageDialog(null, "Email already in use!");
            return false;
        } else{
            Register.createNewClientAccount(bankName, firstName, lastName, clientEmail, password, funds);
            return true;
        }


    }
}
