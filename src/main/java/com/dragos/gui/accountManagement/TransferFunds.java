package com.dragos.gui.accountManagement;

import javax.swing.*;
import java.awt.*;

public class TransferFunds {

    public  TransferFunds() {

        JPanel transferPanel = new JPanel(new GridLayout(3, 2));
        JTextField receiverEmailField = new JTextField(20);

        JTextField amountSentField = new JTextField(10);

        transferPanel.add(new JLabel("Receiver's email:"));
        transferPanel.add(receiverEmailField);
        transferPanel.add(new JLabel("Receiver's bank:"));

        transferPanel.add(new JLabel("Amount to transfer:"));
        transferPanel.add(amountSentField);

//        int result = JOptionPane.showConfirmDialog(this, transferPanel, "Transfer Funds", JOptionPane.OK_CANCEL_OPTION);
//        if (!HashMapOfBanks.getBankHashMap().get(bankNames[(comboBoxBank.getSelectedIndex())]).getListOfClients().containsKey(receiverEmailField.getText())) {
//            showErrorMessage(receiverEmailField.getText().substring(0,1).toUpperCase()+receiverEmailField.getText().substring(1) +" doesn't have an account open with "+(bankNames[(comboBoxBank.getSelectedIndex())]) +" !");
//        } else if (result == JOptionPane.OK_OPTION) {
//            transactionInterface.transferFunds(customer, HashMapOfBanks.getBankHashMap().get(bankNames[(comboBoxBank.getSelectedIndex())]).getListOfClients().get(receiverEmailField.getText()), Double.parseDouble(amountSentField.getText()));
//            updateClientFunds();
//        }
    }
}
