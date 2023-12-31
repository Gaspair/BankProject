package com.dragos.gui;




import com.dragos.sevices.AuthServicesImpl;
import com.dragos.sevices.AuthServicesInterface;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.HashMap;


public class SignUpPage extends JFrame implements ActionListener {
    JLabel title = new JLabel("Let's get you started!");
    JLabel firstName = new JLabel("First name ");
    JLabel lastName = new JLabel("Last name ");
    JLabel password = new JLabel("Password ");
    JLabel funds = new JLabel("<html>First deposit<br>amount</html>");
    JLabel bank = new JLabel("Bank");
    JLabel email = new JLabel("Email");
    JTextField emailTF;
    JTextField firstNameTF;
    JTextField lastNameTF;
    JPasswordField passwordTF;
    JTextField fundsTF;
    JButton submitButton;
    String[] bankNames;
    JComboBox<String> comboBoxBank;
    HashMap banksHashMap ;

    AuthServicesInterface signUp = new AuthServicesImpl();

    SignUpPage() throws SQLException {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);


        banksHashMap =  signUp.getBanks();

        bankNames = (String[]) banksHashMap.keySet().toArray(new String[0]);


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


        funds.setBounds(175, 310, 140, 100);
        funds.setFont(new Font(null, Font.PLAIN, 13));

        bank.setBounds(175, 375, 150, 100);
        bank.setFont(new Font(null, Font.PLAIN, 15));


        firstNameTF = new JTextField();
        firstNameTF.setBounds(250, 195, 150, 27);


        lastNameTF = new JTextField();
        lastNameTF.setBounds(250, 225, 150, 27);


        emailTF = new JTextField();
        emailTF.setBounds(250, 255, 150, 27);


        passwordTF = new JPasswordField();
        passwordTF.setBounds(250, 285, 150, 27);


        fundsTF = new JTextField();
        fundsTF.setBounds(250, 345, 150, 27);

        comboBoxBank = new JComboBox<String>((bankNames));
        comboBoxBank.addActionListener(this);
        comboBoxBank.setBounds(245, 410, 180, 30);

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
        this.setLocationRelativeTo(null);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == submitButton) {
            if ( firstNameTF.getText().isEmpty() || lastNameTF.getText().isEmpty() || emailTF.getText().toLowerCase().isEmpty() || passwordTF.getText().isBlank() || fundsTF.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill in all the fields!");
            } else {
                try {
                    if (signUp.signUp((Integer) banksHashMap.get(bankNames[comboBoxBank.getSelectedIndex()]),emailTF.getText().toLowerCase(), passwordTF.getText(),firstNameTF.getText(), lastNameTF.getText(), Double.parseDouble(fundsTF.getText()))) {
                        this.dispose();
                        new SignInPage();
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "An error occurred please try again!");
                    throw new RuntimeException(ex);
                }
            }
        }

    }


}

