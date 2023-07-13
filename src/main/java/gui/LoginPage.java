

package gui;

        import bank.BankStorage;

        import javax.swing.*;
        import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;

public class LoginPage extends JFrame  implements ActionListener {
    JLabel email = new JLabel("Email ");
    JLabel password = new JLabel("Password ");
    JLabel bank = new JLabel("Bank ");
    JLabel funds = new JLabel("<html>First <br> deposit<br>amount</html>");
    JTextField emailTF;
    JTextField passwordTF;
    JButton loginButton;

    JLabel title = new JLabel("Login");

    JComboBox comboBoxBank;
    LoginPage() {this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<String>();
        for (String element : BankStorage.getBankList()) {
            model.addElement(element);
        }

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

        passwordTF = new JTextField();
        passwordTF.setBounds(245, 235, 150, 27);

        bank.setBounds(175, 255, 100, 50);
        bank.setFont(new Font(null, Font.PLAIN, 15));

        comboBoxBank = new JComboBox<String>((model));
        comboBoxBank.addActionListener(this);
        comboBoxBank.setBounds(245, 265, 180, 30);

        this.add(loginButton);
        this.add(emailTF);
        this.add(passwordTF);
        this.add(email);
        this.add(password);
        this.add(bank);
        this.add(funds);
        this.add(title);
        this.add(comboBoxBank);
        this.setResizable(false);
        this.setSize(750, 750);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == loginButton) {
            new FormValidation().formValidationLogin(emailTF.getText(), password.getText());

            if (FormValidation.isValidLogin) {
                this.dispose();
                 new LandingPage();

            }
        }
    }
}
