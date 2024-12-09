package Bankmanagementsystem;

import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MiniStatement extends JFrame {
    String pinnumber;

    MiniStatement(String pinnumber){
        this.pinnumber = pinnumber;
        setTitle("Mini Statement");
        setLayout(null);

        JLabel text = new JLabel("");
        add(text);

        JLabel bank = new JLabel("");
        bank.setBounds(150,20,100,20);
        add(bank);

        JLabel card = new JLabel("");
        card.setBounds(20,80,300,20);
        add(card);

        try{
            Conn conn = new Conn();
            ResultSet rs = conn.s.executeQuery("select * from login where pinnumber = '"+pinnumber+"'");
            while(rs.next()){
                card.setText("Card Number: " + rs.getString("cardnumber"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        setSize(400,600);
        setLocation(20,20);
        setVisible(true);
    }
    public static void main(String[] args){
        new MiniStatement("pinnumber");
    }
}
