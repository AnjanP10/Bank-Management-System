package Bankmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PinChange extends JFrame implements ActionListener {

    JPasswordField pin, repin;
    JButton change, back;
    JLabel text,pintext,repintext,image;
    String pinnumber;

    PinChange(String pinnumber){
        this.pinnumber = pinnumber;
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);

        text = new JLabel("Change Your PIN");
        text.setForeground(Color.white);
        text.setFont(new Font("System",Font.BOLD,16));
        text.setBounds(260,300,500,35);
        image.add(text);

        pintext = new JLabel("New PIN :");
        pintext.setForeground(Color.white);
        pintext.setFont(new Font("System",Font.BOLD,16));
        pintext.setBounds(180,360,500,35);
        image.add(pintext);

        pin = new JPasswordField();
        pin.setFont(new Font("Raleway", Font.BOLD, 25));
        pin.setBounds(320, 360,180,30);
        image.add(pin);

        repintext = new JLabel("Confirmed PIN :");
        repintext.setForeground(Color.white);
        repintext.setFont(new Font("System",Font.BOLD,16));
        repintext.setBounds(180,400,500,35);
        image.add(repintext);

        repin = new JPasswordField();
        repin.setFont(new Font("Raleway", Font.BOLD, 25));
        repin.setBounds(320, 400,180,30);
        image.add(repin);

        change = new JButton("Change");
        change.setBounds(400,450, 100,35);
        change.addActionListener(this);
        image.add(change);

        back = new JButton("Back");
        back.setBounds(400,490, 100,35);
        back.addActionListener(this);
        image.add(back);


        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == change){
        try{
            String npin = pin.getText();
            String rpin = repin.getText();

            if(!npin.equals(rpin)){
                JOptionPane.showMessageDialog(null,"Entered PIN does not match");
                return ;
            }

            if(npin.equals("")){
                JOptionPane.showMessageDialog(null, "Please enter new PIN");
                return;
            }

            if(rpin.equals("")){
                JOptionPane.showMessageDialog(null,"Please re-enter new PIN");
                return;
            }

            Conn conn = new Conn();
            String query1 = "update bank set pinnumber = '"+rpin+"' where pinnumber = '"+pinnumber+"'";
            String query2 = "update login set pinnumber = '"+rpin+"' where pinnumber = '"+pinnumber+"'";
            String query3 = "update signupthree set pinnumber = '"+rpin+"' where pinnumber = '"+pinnumber+"'";


            conn.s.executeUpdate(query1);
            conn.s.executeUpdate(query2);
            conn.s.executeUpdate(query3);

            JOptionPane.showMessageDialog(null, "PIN changed successfully");

            setVisible(false);
            new Transactions(rpin).setVisible(true);

        } catch (Exception e) {
            System.out.println(e);
        }
        }else {
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        }
    }

    public static void main (String[] args){
        new PinChange("").setVisible(true);
    }
}
