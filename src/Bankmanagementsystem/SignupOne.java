package Bankmanagementsystem;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class SignupOne extends JFrame implements ActionListener {
    long random;
    JTextField nameTextField, fnameTextField, emailTextField, addressTextField, cityTextField, stateTextField, pincodeTextField;
    JLabel formno, personDetails, name, fname, dob, gender, email, marital, address, city, state, pincode ;
    JDateChooser dateChooser;
    JButton next;
    JRadioButton male, female, married, unmarried, other;

    SignupOne(){
        setLayout(null);

        Random ran = new Random();
        random = Math.abs((ran.nextLong() % 9000L) + 1000L); // Use the instance variable `random`

        formno = new JLabel("Application Form No: " + random);
        formno.setFont(new Font("Raleway", Font.BOLD, 38));
        formno.setBounds(140, 20, 600, 40);
        add(formno);

        personDetails = new JLabel("Page 1 : Personal Details");
        personDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        personDetails.setBounds(180, 90, 600, 40);
        add(personDetails);

        name = new JLabel("Name :");
        name.setFont(new Font("Raleway", Font.BOLD, 18));
        name.setBounds(180, 140, 600, 40);
        add(name);

        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway",Font.BOLD, 14));
        nameTextField.setBounds(330, 140, 400, 40);
        add(nameTextField);

        fname = new JLabel("Father's Name :");
        fname.setFont(new Font("Raleway", Font.BOLD, 18));
        fname.setBounds(180, 190, 600, 40);
        add(fname);

        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway",Font.BOLD, 14));
        fnameTextField.setBounds(330, 190, 400, 40);
        add(fnameTextField);

        dob = new JLabel("Date Of Birth :");
        dob.setFont(new Font("Raleway", Font.BOLD, 18));
        dob.setBounds(180, 240, 600, 40);
        add(dob);

        dateChooser = new JDateChooser();
        dateChooser.setBounds(330, 240, 400,40);
        dateChooser.setForeground(new Color(105, 105, 105));
        add(dateChooser);

        gender = new JLabel("Gender :");
        gender.setFont(new Font("Raleway", Font.BOLD, 18));
        gender.setBounds(180, 290, 600, 40);
        add(gender);

        male = new JRadioButton("Male");
        male.setBounds(330, 290,100, 40 );
        add(male);

        female = new JRadioButton("Female");
        female.setBounds(450, 290,140, 40 );
        add(female);

        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);

        email = new JLabel("Email :");
        email.setFont(new Font("Raleway", Font.BOLD, 18));
        email.setBounds(180, 340, 600, 40);
        add(email);

        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway",Font.BOLD, 14));
        emailTextField.setBounds(330, 340, 400, 40);
        add(emailTextField);

        marital = new JLabel("Marital Status :");
        marital.setFont(new Font("Raleway", Font.BOLD, 18));
        marital.setBounds(180, 390, 600, 40);
        add(marital);

        married = new JRadioButton("Married");
        married.setBounds(330, 390,100, 40 );
        add(married);

        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450, 390,140, 40 );
        add(unmarried);

        other = new JRadioButton("Other");
        other.setBounds(580, 390,140, 40 );
        add(other);

        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(married);
        maritalgroup.add(unmarried);
        maritalgroup.add(other);

        address = new JLabel("Address :");
        address.setFont(new Font("Raleway", Font.BOLD, 18));
        address.setBounds(180, 440, 600, 40);
        add(address);

        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway",Font.BOLD, 14));
        addressTextField.setBounds(330, 440, 400, 40);
        add(addressTextField);

        city = new JLabel("City :");
        city.setFont(new Font("Raleway", Font.BOLD, 18));
        city.setBounds(180, 490, 600, 40);
        add(city);

        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway",Font.BOLD, 14));
        cityTextField.setBounds(330, 490, 400, 40);
        add(cityTextField);

        state = new JLabel("State :");
        state.setFont(new Font("Raleway", Font.BOLD, 18));
        state.setBounds(180, 540, 600, 40);
        add(state);

        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway",Font.BOLD, 14));
        stateTextField.setBounds(330, 540, 400, 40);
        add(stateTextField);

        pincode = new JLabel("Pin Code :");
        pincode.setFont(new Font("Raleway", Font.BOLD, 18));
        pincode.setBounds(180, 590, 600, 40);
        add(pincode);

        pincodeTextField = new JTextField();
        pincodeTextField.setFont(new Font("Raleway",Font.BOLD, 14));
        pincodeTextField.setBounds(330, 590, 400, 40);
        add(pincodeTextField);

        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD,14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);


        setSize(850,800);
        setLocation(350, 10);
        setVisible(true);

    }


    public void actionPerformed(ActionEvent ae){
        String formno = "" + random;
        String name = nameTextField.getText();
        String fname = fnameTextField.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (male.isSelected()){
            gender = "Male";
        } else if (female.isSelected()) {
            gender = "Female";
        }
        String email = emailTextField.getText();
        String marital = null;
        if (married.isSelected()){
            marital = "Married";
        } else if (unmarried.isSelected()) {
            marital = "Unmarried";
        } else if (other.isSelected()){
            marital = "Other";
        }
        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pincode = pincodeTextField.getText();

        try{
            if (name.equals("")){
                JOptionPane.showMessageDialog(null, "Name is required");
            } else {
                Conn c = new Conn();
                String query = "insert into signup values('"+formno+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gender+"', '"+email+"', '"+marital+"', '"+address+"', '"+city+"', '"+state+"', '"+pincode+"')";
                c.s.executeUpdate(query);

                setVisible(false);
                new SignupTwo(formno).setVisible(true);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args){
        new SignupOne();

    }
}
