package Bankmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignupTwo extends JFrame implements ActionListener {
    //long random;
    JTextField   panTextField, citizenshipTextField;
    JLabel  additionalDetails, religion, category, income, education, qualification, occupation, pan, citizenship, senior, existing ;
    JButton next;
    JRadioButton  sen_yes, sen_no, exist_yes, exist_no;
    JComboBox religioncombo, categorycombo, incomecombo, educationcombo, occupationcombo;
    String formno;

    SignupTwo(String formno){

        this.formno = formno;
        setLayout(null);

        setTitle("New Account Application Form - Page 2");

        additionalDetails = new JLabel("Page 2 : Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(180, 90, 600, 40);
        add(additionalDetails);

        religion = new JLabel("Religion :");
        religion.setFont(new Font("Raleway", Font.BOLD, 18));
        religion.setBounds(180, 140, 600, 40);
        add(religion);

        String valReligion[] = {"Hindu", "Buddhist", "Christian", "Muslim", "Others"};
        religioncombo = new JComboBox(valReligion);
        religioncombo.setBounds(330, 140, 400, 40);
        add(religioncombo);

        category = new JLabel("Category :");
        category.setFont(new Font("Raleway", Font.BOLD, 18));
        category.setBounds(180, 190, 600, 40);
        add(category);

        String valcategory[] = {"General", "OBC", "SC", "ST", "Other"};
        categorycombo = new JComboBox(valcategory);
        categorycombo.setBounds(330, 190, 400, 40);
        add(categorycombo);

        income = new JLabel("Income :");
        income.setFont(new Font("Raleway", Font.BOLD, 18));
        income.setBounds(180, 240, 600, 40);
        add(income);

        String incomecategory[] = {"Null", "<20,000", "<60,000", "<1,00,000", "<10,00,000"};
        incomecombo = new JComboBox(incomecategory);
        incomecombo.setBounds(330, 240, 400, 40);
        add(incomecombo);

        education = new JLabel("Educational");
        education.setFont(new Font("Raleway", Font.BOLD, 18));
        education.setBounds(180, 290, 600, 40);
        add(education);

        qualification = new JLabel("Qualification :");
        qualification.setFont(new Font("Raleway", Font.BOLD, 18));
        qualification.setBounds(180, 320, 600, 40);
        add(qualification);

        String educationValues[] = {"Non-Graduation", "SEE", "+2(High School)", "Bachelor", "Master"};
        educationcombo = new JComboBox(educationValues);
        educationcombo.setBounds(330, 300, 400, 40);
        add(educationcombo);

        occupation = new JLabel("Occupation :");
        occupation.setFont(new Font("Raleway", Font.BOLD, 18));
        occupation.setBounds(180, 390, 600, 40);
        add(occupation);

        String occupationValues[] = {"Government Employee", "Business", "Private Office", "Self Employed", "Student", "Unemployed"};
        occupationcombo = new JComboBox(occupationValues);
        occupationcombo.setBounds(330, 390, 400, 40);
        add(occupationcombo);

        pan = new JLabel("Pan No :");
        pan.setFont(new Font("Raleway", Font.BOLD, 18));
        pan.setBounds(180, 440, 600, 40);
        add(pan);

        panTextField = new JTextField();
        panTextField.setFont(new Font("Raleway",Font.BOLD, 14));
        panTextField.setBounds(330, 440, 400, 40);
        add(panTextField);

        citizenship = new JLabel("Citizenship No :");
        citizenship.setFont(new Font("Raleway", Font.BOLD, 18));
        citizenship.setBounds(180, 490, 600, 40);
        add(citizenship);

        citizenshipTextField = new JTextField();
        citizenshipTextField.setFont(new Font("Raleway",Font.BOLD, 14));
        citizenshipTextField.setBounds(330, 490, 400, 40);
        add(citizenshipTextField);

        senior = new JLabel("Senior Citizen:");
        senior.setFont(new Font("Raleway", Font.BOLD, 18));
        senior.setBounds(180, 540, 600, 40);
        add(senior);

        sen_yes= new JRadioButton("Yes");
        sen_yes.setBounds(380, 540,100, 40 );
        add(sen_yes);

        sen_no = new JRadioButton("No");
        sen_no.setBounds(490, 540,140, 40 );
        add(sen_no);

        ButtonGroup seniorgroup = new ButtonGroup();
        seniorgroup.add(sen_yes);
        seniorgroup.add(sen_no);

        existing = new JLabel("Existing Account :");
        existing.setFont(new Font("Raleway", Font.BOLD, 18));
        existing.setBounds(180, 590, 600, 40);
        add(existing);

        exist_yes= new JRadioButton("Yes");
        exist_yes.setBounds(380, 590,100, 40 );
        add(exist_yes);

        exist_no = new JRadioButton("No");
        exist_no.setBounds(490, 590,140, 40 );
        add(exist_no);

        ButtonGroup existinggroup = new ButtonGroup();
        existinggroup.add(exist_yes);
        existinggroup.add(exist_no);

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
        //String formno = "" + random;
        String religion = (String)religioncombo.getSelectedItem();
        String category = (String)categorycombo.getSelectedItem();
        String income = (String)incomecombo.getSelectedItem();
        String education = (String)educationcombo.getSelectedItem();
        String occupation = (String)occupationcombo.getSelectedItem();

        String senior = null;
        if (sen_yes.isSelected()){
            senior = "Yes";
        } else if (sen_no.isSelected()) {
            senior = "No";
        }

        String existing = null;
        if (exist_yes.isSelected()){
            existing = "Yes";
        } else if (exist_no.isSelected()) {
            existing = "No";
        }

        String pan = panTextField.getText();
        String citizenship = citizenshipTextField.getText();


        try{

                Conn c = new Conn();
                String query = "insert into signuptwo values('"+formno+"', '"+religion+"', '"+category+"', '"+income+"', '"+education+"', '"+occupation+"', '"+senior+"', '"+pan+"', '"+citizenship+"',  '"+existing+"')";
                c.s.executeUpdate(query);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args){
        new SignupTwo("");

    }
}
