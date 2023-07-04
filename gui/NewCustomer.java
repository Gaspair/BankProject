package gui;

//import controller.Controller;

import bank.BankStorage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class NewCustomer extends JFrame implements ActionListener {
    JLabel title = new JLabel("Let's get you started!");
    JLabel name = new JLabel("Name ");
    JLabel password = new JLabel("Password ");
    JLabel funds = new JLabel("<html>First <br> deposit<br>amount</html>");
    JLabel bank = new JLabel("Bank");
    JTextField nameTF;
    JTextField passwordTF;
    JTextField fundsTF;
    JButton submitButton;


    JComboBox comboBoxBank;


    NewCustomer() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<String>();
        for (String element : BankStorage.getBankList()) {
            model.addElement(element);
        }

        comboBoxBank = new JComboBox<String>((model));
        comboBoxBank.addActionListener(this);
        comboBoxBank.setBounds(245, 400, 180, 30);

        bank.setBounds(175, 365, 150, 100);
        bank.setFont(new Font(null, Font.PLAIN, 15));


        submitButton = new JButton("Submit");
        submitButton.setBounds(250, 450, 80, 30);
        submitButton.addActionListener(this);

        title.setBounds(150, 0, 500, 250);
        title.setFont(new Font(null, Font.PLAIN, 50));


        name.setBounds(175, 200, 100, 50);
        name.setFont(new Font(null, Font.PLAIN, 15));

        nameTF = new JTextField();
        nameTF.setBounds(245, 215, 150, 20);

        password.setBounds(175, 250, 100, 50);
        password.setFont(new Font(null, Font.PLAIN, 15));

        passwordTF = new JTextField();
        passwordTF.setBounds(245, 265, 150, 20);

        funds.setBounds(175, 300, 150, 100);
        funds.setFont(new Font(null, Font.PLAIN, 15));

        fundsTF = new JTextField();
        fundsTF.setBounds(245, 335, 150, 20);

        this.add(bank);
        this.add(comboBoxBank);
        this.add(submitButton);
        this.add(nameTF);
        this.add(passwordTF);
        this.add(fundsTF);
        this.add(name);
        this.add(password);
        this.add(funds);
        this.add(title);
        this.setResizable(false);
        this.setSize(750, 750);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

//        if (e.getSource() == submitButton) {
//            new FormValidation().formValidationRegister(nameTF.getText(), fundsTF.getText(), comboBoxBank.getSelectedIndex());
//
//            if (FormValidation.isValidRegister) {
//                this.dispose();
//                LoginPage loginPage = new LoginPage();
//
//            }
//        }


    }
}
