package gui;

import client.Client;

import javax.swing.*;

public class FormValidation {

    public static boolean isValid = false;
        public void formValidation(String name, String amount){
            if(name.isEmpty() || amount.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Please fill in all the fields");
            }else{
                Client newClient = new Client(name, Double.parseDouble(amount));
                isValid = true;
            }



        }



}
