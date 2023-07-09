package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import bank.BankStorage;

public class NewCustomer extends JFrame implements ActionListener {
    JLabel title = new JLabel("Let's get you started!");
    JLabel firstName = new JLabel("First name ");
    JLabel lastName = new JLabel("Last name ");
    JLabel password = new JLabel("Password ");
    JLabel funds = new JLabel("<html>First <br> deposit<br>amount</html>");
    JLabel bank = new JLabel("Bank");
    JLabel email = new JLabel("Email");
    JTextField emailTF;
    JTextField firstNameTF;
    JTextField lastNameTF;
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

        submitButton = new JButton("Submit");
        submitButton.setBounds(250, 450, 80, 30);
        submitButton.addActionListener(this);

        title.setBounds(150, 0, 500, 250);
        title.setFont(new Font(null, Font.PLAIN, 50));


        firstName.setBounds(175, 180, 100, 50);
        firstName.setFont(new Font(null, Font.PLAIN, 15));

        lastName.setBounds(175, 210, 100, 50);
        lastName.setFont(new Font(null, Font.PLAIN, 15));

        email.setBounds(175, 240, 100, 50);
        email.setFont(new Font(null, Font.PLAIN, 15));

        password.setBounds(175, 270, 100, 50);
        password.setFont(new Font(null, Font.PLAIN, 15));

//        dateOfBirth.setBounds(175, 300, 100, 50);
//        dateOfBirth.setFont(new Font(null, Font.PLAIN, 15));

        funds.setBounds(175, 330, 150, 100);
        funds.setFont(new Font(null, Font.PLAIN, 15));

        bank.setBounds(175, 365, 150, 100);
        bank.setFont(new Font(null, Font.PLAIN, 15));


        firstNameTF = new JTextField();
        firstNameTF.setBounds(250, 195, 150, 20);


        lastNameTF = new JTextField();
        lastNameTF.setBounds(250, 225, 150, 20);


        emailTF = new JTextField();
        emailTF.setBounds(250, 255, 150, 20);


        passwordTF = new JTextField();
        passwordTF.setBounds(250, 285, 150, 20);


        fundsTF = new JTextField();
        fundsTF.setBounds(250, 315, 150, 20);

        comboBoxBank = new JComboBox<String>((model));
        comboBoxBank.addActionListener(this);
        comboBoxBank.setBounds(245, 400, 180, 30);


        this.add(emailTF);
        this.add(email);
        this.add(bank);
        this.add(comboBoxBank);
        this.add(submitButton);
        this.add(lastName);
        this.add(firstName);
        this.add(lastNameTF);
        this.add(passwordTF);
        this.add(fundsTF);
        this.add(firstNameTF);
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
