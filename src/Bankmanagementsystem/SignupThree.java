package Bankmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignupThree extends JFrame implements ActionListener {


    JRadioButton r1, r2, r3, r4;
    JCheckBox c1, c2, c3, c4, c5, c6, c7;
    JButton submit, cancel;
    String formno;

    SignupThree( String formno){

        this.formno = formno;
        setLayout(null);

        JLabel l1 = new JLabel("Page 3 : Account Details");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l1.setBounds(280, 40, 400, 40);
        add(l1);

        JLabel accounttype = new JLabel("Account Type :");
        accounttype.setFont(new Font("Raleway", Font.BOLD, 22));
        accounttype.setBounds(100, 140, 200, 40);
        add(accounttype);

        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway", Font.BOLD, 16));
        r1.setBounds(100, 190, 190, 20);
        add(r1);

        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway", Font.BOLD, 16));
        r2.setBounds(350, 190, 220, 20);
        add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway", Font.BOLD, 16));
        r3.setBounds(100, 230, 190, 20);
        add(r3);

        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway", Font.BOLD, 16));
        r4.setBounds(350, 230, 280, 20);
        add(r4);

        ButtonGroup groupaccount = new ButtonGroup();
        groupaccount.add(r1);
        groupaccount.add(r2);
        groupaccount.add(r3);
        groupaccount.add(r4);

        JLabel card = new JLabel("Card Number :");
        card.setFont(new Font("Raleway", Font.BOLD, 22));
        card.setBounds(100,300,200,30);
        add(card);

        JLabel cardnumber = new JLabel("XXXX-XXXX-XXXX-4134");
        cardnumber.setFont(new Font("Raleway", Font.BOLD, 22));
        cardnumber.setBounds(330,300,300,30);
        add(cardnumber);

        JLabel carddetail = new JLabel("Your 16 Digit Card Number ");
        carddetail.setFont(new Font("Raleway", Font.BOLD, 12));
        carddetail.setBounds(100,320,300,30);
        add(carddetail);

        JLabel pin = new JLabel("Pin :");
        pin.setFont(new Font("Raleway", Font.BOLD, 22));
        pin.setBounds(100,380,200,30);
        add(pin);

        JLabel pindetail = new JLabel("Your 4 Digit Password");
        pindetail.setFont(new Font("Raleway", Font.BOLD, 12));
        pindetail.setBounds(100,400,300,30);
        add(pindetail);

        JLabel pinnumber = new JLabel("XXXX");
        pinnumber.setFont(new Font("Raleway", Font.BOLD, 22));
        pinnumber.setBounds(330,380,300,30);
        add(pinnumber);

        JLabel services = new JLabel("Services Required :");
        services.setFont(new Font("Raleway", Font.BOLD, 22));
        services.setBounds(100,450,300,30);
        add(services);

        c1 = new JCheckBox("ATM Card");
        c1.setFont(new Font("Raleway", Font.BOLD, 16));
        c1.setBounds(100,500,200,30);
        add(c1);

        c2 = new JCheckBox("Mobile Banking");
        c2.setFont(new Font("Raleway", Font.BOLD, 16));
        c2.setBounds(350,500,200,30);
        add(c2);

        c3 = new JCheckBox("Internet Banking");
        c3.setFont(new Font("Raleway", Font.BOLD, 16));
        c3.setBounds(100,550,200,30);
        add(c3);

        c4 = new JCheckBox("Email/SMS Alerts");
        c4.setFont(new Font("Raleway", Font.BOLD, 16));
        c4.setBounds(350,550,200,30);
        add(c4);

        c5 = new JCheckBox("Cheque Book");
        c5.setFont(new Font("Raleway", Font.BOLD, 16));
        c5.setBounds(100,600,200,30);
        add(c5);

        c6 = new JCheckBox("E Statement");
        c6.setFont(new Font("Raleway", Font.BOLD, 16));
        c6.setBounds(350,600,200,30);
        add(c6);

        c7 = new JCheckBox("I hereby declare that the above entered details are correct to the best of my knowledge ");
        c7.setFont(new Font("Raleway", Font.BOLD, 12));
        c7.setBounds(100,650,600,30);
        add(c7);

        submit = new JButton("Submit");
        submit.setFont(new Font("Raleway", Font.BOLD, 14));
        submit.setBounds(250,720,100,30);
        submit.addActionListener(this);
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setFont(new Font("Raleway", Font.BOLD, 14));
        cancel.setBounds(420,720,100,30);
        cancel.addActionListener(this);
        add(cancel);

        getContentPane().setBackground(Color.CYAN);


        setSize(850,820);
        setLocation(350, 0);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){

        if (ae.getSource() == submit){
            String accounttype = null;
            if(r1.isSelected()){
                accounttype = "Saving Account";
            } else if (r2.isSelected()) {
                accounttype = "Fixed Deposit Account";
            } else if (r3.isSelected()) {
                accounttype = "Current Account";
            } else if (r4.isSelected()){
                accounttype = "Reccuring Deposit Account";
            }

            Random random = new Random();
            String cardnumber = "" + Math.abs((random.nextLong() % 90000000L) + 5040936000000000L);

            String pinnumber = "" + Math.abs((random.nextLong() % 9000L) + 1000L);

            String services = "";
            if(c1.isSelected()){
                services = services + " ATM Card";
            } else if (c2.isSelected()) {
                services = services + " Mobile Banking";
            } else if (c3.isSelected()) {
                services = services + " Internet Banking";
            } else if (c4.isSelected()) {
                services = services + " Email/SMS Alerts";
            }else if (c5.isSelected()) {
                services = services + " Cheque Book";
            } else if (c6.isSelected()) {
                services = services + " E Statement";
            }

            try {
                if (accounttype.equals("")){
                    JOptionPane.showMessageDialog(null, "Account Type is Required");
                } else{
                    Conn conn = new Conn();
                    String query1 = "insert into signupthree values('"+formno+"', '"+accounttype+"', '"+cardnumber+"', '"+pinnumber+"', '"+services+"')";
                    String query2 = "insert into login values('"+formno+"', '"+cardnumber+"', '"+pinnumber+"')";

                    conn.s.executeUpdate(query1);
                    conn.s.executeUpdate(query2);

                    JOptionPane.showMessageDialog(null, "Card Number :" +cardnumber + "\n Pin :" +pinnumber);

                    setVisible(false);
                    new Deposit(pinnumber).setVisible(false);
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        } else if (ae.getSource() == cancel) {
            setVisible(false);
            new Login().setVisible(true);
        }
    }
    public static void main (String[] args){
        new SignupThree("");
    }
}
