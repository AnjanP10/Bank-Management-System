package Bankmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {

    JButton login, clear, signup;
    JTextField cardTextField;
    JPasswordField pinTextField;

    Login() {
        setTitle("Automated Teller Machine");
        setLayout(null);

        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("Osward", Font.BOLD,38));
        text.setBounds(200, 40 , 400 , 40);
        add(text);

        JLabel cardno = new JLabel("Card No:");
        cardno.setFont(new Font("Raleway", Font.BOLD,22));
        cardno.setBounds(220, 120 , 400 , 40);
        add(cardno);

        cardTextField = new JTextField();
        cardTextField.setBounds(340, 120, 300, 40);
        add(cardTextField);

        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Raleway", Font.BOLD,22));
        pin.setBounds(220, 200 , 400 , 40);
        add(pin);

        pinTextField = new JPasswordField();
        pinTextField.setBounds(340, 200, 300, 40);
        add(pinTextField);

        login = new JButton ("Login");
        login.setBounds(340, 280, 100, 40);
        login.addActionListener(this);
        add(login);

        clear = new JButton ("Clear all");
        clear.setBounds(490, 280, 100, 40);
        clear.addActionListener(this);
        add(clear);

        JLabel disclaimer = new JLabel("Don't have an account ? ");
        disclaimer.setFont(new Font("italic",Font.ITALIC,16));
        disclaimer.setBounds(220, 360 , 400 , 40);
        add(disclaimer);

        signup = new JButton ("Sign up");
        signup.setBounds(420, 360, 100, 40);
        signup.addActionListener(this);
        add(signup);


        setSize(800, 480);
        setVisible(true);
        setLocation(350, 200);

        // Correct the resource path
       /* ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        JLabel label = new JLabel(i1);
        add(label);*/
    }

    public void actionPerformed(ActionEvent ae){

        if(ae.getSource() == clear){
            cardTextField.setText("");
            pinTextField.setText("");

        } else if(ae.getSource() == login){

        } else if (ae.getSource() == signup) {
            setVisible(false);
            new SignupOne().setVisible(true);
        }
    }
    public static void main(String[] args) {
        new Login();
    }
}
