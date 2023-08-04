package com.dragos.gui.accountManagement;

import com.dragos.businessLogic.Client;
import com.dragos.sevices.Operations.OperationsInterface;
import com.dragos.sevices.Operations.OperationsInterfaceImpl;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LandingPage extends JFrame implements ActionListener {
    OperationsInterface transactionInterface = new OperationsInterfaceImpl();
    private Client client;
    JLabel welcome = new JLabel("Welcome");
    JLabel funds = new JLabel("Funds");
    JButton depositButton = new JButton("Deposit");
    JButton withdrawButton = new JButton("Withdraw");
    JButton transferButton = new JButton("Transfer");
    JButton accountSettingButton = new JButton("Account \n settings");
    JLabel customerFunds;

    public LandingPage(Client client) {
        this.client = client;
        welcome.setBounds(50, 100, 150, 50);
        welcome.setFont(new Font(null, Font.PLAIN, 25));

        funds.setBounds(50, 200, 150, 50);
        funds.setFont(new Font(null, Font.PLAIN, 25));

        customerFunds = new JLabel(String.valueOf(client.getClientAccount().getFunds()));
        customerFunds.setBounds(50, 250, 150, 50);
        customerFunds.setFont(new Font(null, Font.PLAIN, 18));

        String customerFullName = client.getFirstName().concat(" ").concat(client.getLastName());
        JLabel customerName = new JLabel(customerFullName);
        customerName.setBounds(50, 150, 150, 50);
        customerName.setFont(new Font(null, Font.PLAIN, 18));

        depositButton.setBounds(500, 120, 250, 150);
        depositButton.addActionListener(this);
        withdrawButton.setBounds(800, 120, 250, 150);
        withdrawButton.addActionListener(this);
        transferButton.setBounds(500, 300, 250, 150);
        transferButton.addActionListener(this);
        accountSettingButton.setBounds(800, 300, 250, 150);

//       depositButton.addActionListener(e -> DepositFunds.handleDeposit());
//        withdrawButton.addActionListener(e -> handleWithdraw());
//        transferButton.addActionListener(e -> handleTransfer());


        this.add(customerFunds);
        this.add(funds);
        this.add(accountSettingButton);
        this.add(transferButton);
        this.add(withdrawButton);
        this.add(depositButton);
        this.add(customerName);
        this.add(welcome);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1250, 650);
        this.setLayout(null);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

