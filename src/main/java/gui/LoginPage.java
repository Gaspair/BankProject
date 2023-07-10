

package gui;

        import javax.swing.*;
        import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;

public class LoginPage extends JFrame  implements ActionListener {
    JLabel name = new JLabel("Name ");
    JLabel password = new JLabel("Password ");
    JLabel funds = new JLabel("<html>First <br> deposit<br>amount</html>");
    JTextField nameTF;
    JTextField passwordTF;
    JButton loginButton;

    JLabel title = new JLabel("Login");

    LoginPage() {this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

        loginButton = new JButton("Login");
        loginButton.setBounds(250, 275, 80, 30);
        loginButton.addActionListener(this);

        title.setBounds(150, 0, 500, 250);
        title.setFont(new Font(null, Font.PLAIN, 50));


        name.setBounds(175, 200, 100, 50);
        name.setFont(new Font(null, Font.PLAIN, 15));

        nameTF = new JTextField();
        nameTF.setBounds(245, 215, 150, 20);

        password.setBounds(175, 225, 100, 50);
        password.setFont(new Font(null, Font.PLAIN, 15));

        passwordTF = new JTextField();
        passwordTF.setBounds(245, 240, 150, 20);

        this.add(loginButton);
        this.add(nameTF);
        this.add(passwordTF);
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

        if (e.getSource() == loginButton) {
            new FormValidation().formValidationLogin(nameTF.getText(), password.getText());

            if (FormValidation.isValidLogin) {
                this.dispose();
                 new LandingPage();

            }
        }
    }
}
