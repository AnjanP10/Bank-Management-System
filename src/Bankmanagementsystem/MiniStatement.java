package Bankmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MiniStatement extends JFrame {
    String pinnumber;

    MiniStatement(String pinnumber){
        this.pinnumber = pinnumber;
        setTitle("Mini Statement");
        setLayout(null);

        JLabel mini = new JLabel("");
        add(mini);

        JLabel bank = new JLabel("Nepal Rastra Bank");
        bank.setFont(new Font("System",Font.BOLD,18));
        bank.setBounds(110,30,200,20);
        add(bank);

        JLabel card = new JLabel("");
        card.setBounds(20,80,300,20);
        add(card);

        JLabel balance = new JLabel("");
        balance.setBounds(20,400,300,20);
        add(balance);

        try{
            Conn conn = new Conn();
            ResultSet rs = conn.s.executeQuery("select * from login where pinnumber = '"+pinnumber+"'");
            while(rs.next()){
                card.setText("Card Number: " + rs.getString("cardnumber").substring(0,4) + "XXXXXXX" + rs.getString("cardnumber").substring(12));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        try{
            Conn conn = new Conn();
            int bal = 0;
            ResultSet rs = conn.s.executeQuery("select * from bank where pinnumber = '"+pinnumber+"'");
            while(rs.next()){
                mini.setText(mini.getText() + "<html>"+ rs.getString("date") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("amount") + "<br><br>" );
                if (rs.getString("type").equals("Deposit")) {
                    bal += Integer.parseInt(rs.getString("amount"));
                } else {
                    bal -= Integer.parseInt(rs.getString("amount"));
                }
            }

            balance.setText("Your current account balance is Rs " + bal);
        } catch (Exception e) {
            System.out.println(e);
        }

        mini.setBounds(20,140,400,200);

        setSize(400,600);
        setLocation(20,20);
        setVisible(true);
    }
    public static void main(String[] args){
        new MiniStatement("pinnumber");
    }
}
