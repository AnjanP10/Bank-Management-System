package Bankmanagementsystem;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class SignupOne extends JFrame {

    SignupOne(){

        setLayout(null);

        Random ran = new Random();
        long random = Math.abs((ran.nextLong() % 9000L) + 1000L);

        JLabel formno = new JLabel("Application Form No: " + random);
        formno.setFont(new Font("Raleway", Font.BOLD, 38));
        formno.setBounds(140, 20, 600, 40);
        add(formno);

        JLabel personDetails = new JLabel("Page 1 : Personal Details");
        personDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        personDetails.setBounds(180, 90, 600, 40);
        add(personDetails);

        JLabel name = new JLabel("Name :");
        name.setFont(new Font("Raleway", Font.BOLD, 18));
        name.setBounds(180, 140, 600, 40);
        add(name);

        JTextField nameTextfield = new JTextField();
        nameTextfield.setFont(new Font("Raleway",Font.BOLD, 14));
        nameTextfield.setBounds(330, 140, 400, 40);
        add(nameTextfield);

        JLabel fname = new JLabel("Father's Name :");
        fname.setFont(new Font("Raleway", Font.BOLD, 18));
        fname.setBounds(180, 190, 600, 40);
        add(fname);

        JTextField fnameTextfield = new JTextField();
        fnameTextfield.setFont(new Font("Raleway",Font.BOLD, 14));
        fnameTextfield.setBounds(330, 190, 400, 40);
        add(fnameTextfield);

        JLabel dob = new JLabel("Date Of Birth :");
        dob.setFont(new Font("Raleway", Font.BOLD, 18));
        dob.setBounds(180, 240, 600, 40);
        add(dob);

        JDateChooser dateChooser = new JDateChooser();
        dateChooser.setBounds(330, 240, 400,40);
        dateChooser.setForeground(new Color(105, 105, 105));
        add(dateChooser);

        JLabel gender = new JLabel("Gender :");
        gender.setFont(new Font("Raleway", Font.BOLD, 18));
        gender.setBounds(180, 290, 600, 40);
        add(gender);

        JRadioButton male = new JRadioButton("Male");
        male.setBounds(330, 290,100, 40 );
        add(male);

        JRadioButton female = new JRadioButton("Female");
        female.setBounds(450, 290,140, 40 );
        add(female);

        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);

        JLabel email = new JLabel("Email :");
        email.setFont(new Font("Raleway", Font.BOLD, 18));
        email.setBounds(180, 340, 600, 40);
        add(email);

        JTextField emailTextfield = new JTextField();
        emailTextfield.setFont(new Font("Raleway",Font.BOLD, 14));
        emailTextfield.setBounds(330, 340, 400, 40);
        add(emailTextfield);

        JLabel marital = new JLabel("Marital Status :");
        marital.setFont(new Font("Raleway", Font.BOLD, 18));
        marital.setBounds(180, 390, 600, 40);
        add(marital);

        JRadioButton married = new JRadioButton("Married");
        married.setBounds(330, 390,100, 40 );
        add(married);

        JRadioButton unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450, 390,140, 40 );
        add(unmarried);

        JRadioButton other = new JRadioButton("Other");
        other.setBounds(580, 390,140, 40 );
        add(other);

        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(married);
        maritalgroup.add(unmarried);
        maritalgroup.add(other);

        JLabel address = new JLabel("Address :");
        address.setFont(new Font("Raleway", Font.BOLD, 18));
        address.setBounds(180, 440, 600, 40);
        add(address);

        JTextField addressTextfield = new JTextField();
        addressTextfield.setFont(new Font("Raleway",Font.BOLD, 14));
        addressTextfield.setBounds(330, 440, 400, 40);
        add(addressTextfield);

        JLabel city = new JLabel("City :");
        city.setFont(new Font("Raleway", Font.BOLD, 18));
        city.setBounds(180, 490, 600, 40);
        add(city);

        JTextField cityTextfield = new JTextField();
        cityTextfield.setFont(new Font("Raleway",Font.BOLD, 14));
        cityTextfield.setBounds(330, 490, 400, 40);
        add(cityTextfield);

        JLabel state = new JLabel("State :");
        state.setFont(new Font("Raleway", Font.BOLD, 18));
        state.setBounds(180, 540, 600, 40);
        add(state);

        JTextField stateTextfield = new JTextField();
        stateTextfield.setFont(new Font("Raleway",Font.BOLD, 14));
        stateTextfield.setBounds(330, 540, 400, 40);
        add(stateTextfield);

        JLabel pincode = new JLabel("Pin Code :");
        pincode.setFont(new Font("Raleway", Font.BOLD, 18));
        pincode.setBounds(180, 590, 600, 40);
        add(pincode);

        JTextField pincodeTextfield = new JTextField();
        pincodeTextfield.setFont(new Font("Raleway",Font.BOLD, 14));
        pincodeTextfield.setBounds(330, 590, 400, 40);
        add(pincodeTextfield);

        JButton next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD,14));
        next.setBounds(620, 660, 80, 30);
        add(next);


        setSize(850,800);
        setLocation(350, 10);
        setVisible(true);

    }



    public static void main(String[] args){
        new SignupOne();

    }
}
