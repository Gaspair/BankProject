package gui;



import client.Client;

import javax.swing.*;

public class FormValidation {

    public static boolean isValidRegister = false;

    public static boolean isValidLogin = false;
        public void formValidationRegister(String firstName,String lastName,String email,String password, String funds, int selectedIndex){




            if( firstName.isEmpty() || lastName.isEmpty() || email.isEmpty() ||  password.isEmpty() ||  funds.isEmpty()){


                    JOptionPane.showMessageDialog(null, "Please fill in all the fields");
            }else{
                Integer.parseInt(password);
                Integer.parseInt(funds);
//                Client(firstName, Double.parseDouble(amount),selectedIndex);
                isValidRegister = true;
            }



        }

    public void formValidationLogin(String name, String password){
        if(name.isEmpty() || password.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please fill in all the fields");
        }else{
//            new Controller().loginCustomer(name, password);
            isValidLogin = true;
        }



    }



}
