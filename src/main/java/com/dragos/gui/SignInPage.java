package com.dragos.gui;

import com.dragos.gui.accountManagement.LandingPage;

import businessLogic.Client;
import com.dragos.sevices.AuthServicesImpl;
import com.dragos.sevices.AuthServicesInterface;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class SignInPage extends JFrame implements ActionListener {


    JLabel email = new JLabel("Email ");
    JLabel password = new JLabel("Password ");
    JLabel funds = new JLabel("<html>First <br> deposit<br>amount</html>");
    JTextField emailTF;
    JPasswordField passwordTF;
    JButton loginButton;
    JLabel title = new JLabel("Login");

    public SignInPage() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);



        loginButton = new JButton("Login");
        loginButton.setBounds(250, 300, 80, 30);
        loginButton.addActionListener(this);

        title.setBounds(250, 0, 500, 250);
        title.setFont(new Font(null, Font.PLAIN, 50));


        email.setBounds(175, 195, 100, 50);
        email.setFont(new Font(null, Font.PLAIN, 15));

        emailTF = new JTextField();
        emailTF.setBounds(245, 205, 150, 27);

        password.setBounds(175, 225, 100, 50);
        password.setFont(new Font(null, Font.PLAIN, 15));

        passwordTF = new JPasswordField();
        passwordTF.setBounds(245, 235, 150, 27);




        this.add(loginButton);
        this.add(emailTF);
        this.add(passwordTF);
        this.add(email);
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
        if (e.getSource() == loginButton) {
            AuthServicesInterface signIn =new AuthServicesImpl();
            if (emailTF.getText().isEmpty() || passwordTF.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill in all the fields!");
            }
            try {
                Client client =signIn.signIn(1, emailTF.getText(), passwordTF.getText());
                if (client != null){
                    new LandingPage(client);
                }

            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }

        }


        }



    }

