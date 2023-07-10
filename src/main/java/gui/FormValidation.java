package gui;



import javax.swing.*;

public class FormValidation {

    public static boolean isValidRegister = false;

    public static boolean isValidLogin = false;
        public void formValidationRegister(String name, String amount, int selectedIndex){


            if(name.isEmpty() || amount.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Please fill in all the fields");
            }else{
//                new Controller().newCustomer(name, Double.parseDouble(amount),selectedIndex);
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
