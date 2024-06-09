package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup extends JFrame implements ActionListener {
    public static JRadioButton r1, r2, m1, m2, m3;
    JButton next;

    public static JTextField textName, textFname, textEmail, textAdd, textcity, textPin;

    Signup() {
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25, 10, 100, 100);
        add(image);

        JLabel label1 = new JLabel("APPLICATION FORM ");
        label1.setBounds(250, 20, 600, 40);
        label1.setFont(new Font("Raleway", Font.BOLD, 38));
        add(label1);

        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Raleway", Font.BOLD, 22));
        label3.setBounds(290, 90, 600, 30);
        add(label3);

        JLabel labelName = new JLabel("Name :");
        labelName.setFont(new Font("Raleway", Font.BOLD, 20));
        labelName.setBounds(100, 190, 100, 30);
        add(labelName);

        textName = new JTextField("");
        textName.setFont(new Font("Raleway", Font.BOLD, 14));
        textName.setBounds(300, 190, 400, 30);
        add(textName);

        JLabel labelfName = new JLabel("Father's Name :");
        labelfName.setFont(new Font("Raleway", Font.BOLD, 20));
        labelfName.setBounds(100, 240, 200, 30);
        add(labelfName);

        textFname = new JTextField("");
        textFname.setFont(new Font("Raleway", Font.BOLD, 14));
        textFname.setBounds(300, 240, 400, 30);
        add(textFname);

        JLabel labelPin = new JLabel("Pin Code :");
        labelPin.setFont(new Font("Raleway", Font.BOLD, 20));
        labelPin.setBounds(100, 340, 200, 30);
        add(labelPin);

        textPin = new JTextField("");
        textPin.setFont(new Font("Raleway", Font.BOLD, 14));
        textPin.setBounds(300, 340, 400, 30);
        add(textPin);

        JLabel labelG = new JLabel("Gender");
        labelG.setFont(new Font("Raleway", Font.BOLD, 20));
        labelG.setBounds(100, 290, 200, 30);
        add(labelG);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBackground(new Color(222, 255, 228));
        r1.setBounds(300, 290, 60, 30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setBackground(new Color(222, 255, 228));
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBounds(450, 290, 90, 30);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel labelEmail = new JLabel("Email address :");
        labelEmail.setFont(new Font("Raleway", Font.BOLD, 20));
        labelEmail.setBounds(100, 390, 200, 30);
        add(labelEmail);

        textEmail = new JTextField("");
        textEmail.setFont(new Font("Raleway", Font.BOLD, 14));
        textEmail.setBounds(300, 390, 400, 30);
        add(textEmail);

        JLabel labelMs = new JLabel("Marital Status :");
        labelMs.setFont(new Font("Raleway", Font.BOLD, 20));
        labelMs.setBounds(100, 440, 200, 30);
        add(labelMs);

        m1 = new JRadioButton("Married");
        m1.setBounds(300, 440, 100, 30);
        m1.setBackground(new Color(222, 255, 228));
        m1.setFont(new Font("Raleway", Font.BOLD, 14));
        add(m1);

        m2 = new JRadioButton("Unmarried");
        m2.setBackground(new Color(222, 255, 228));
        m2.setBounds(450, 440, 100, 30);
        m2.setFont(new Font("Raleway", Font.BOLD, 14));
        add(m2);

        m3 = new JRadioButton("Other");
        m3.setBackground(new Color(222, 255, 228));
        m3.setBounds(635, 440, 100, 30);
        m3.setFont(new Font("Raleway", Font.BOLD, 14));
        add(m3);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);
        buttonGroup1.add(m3);

        JLabel labelAdd = new JLabel("Address :");
        labelAdd.setFont(new Font("Raleway", Font.BOLD, 20));
        labelAdd.setBounds(100, 490, 200, 30);
        add(labelAdd);

        textAdd = new JTextField("");
        textAdd.setFont(new Font("Raleway", Font.BOLD, 14));
        textAdd.setBounds(300, 490, 400, 30);
        add(textAdd);

        JLabel labelCity = new JLabel("City :");
        labelCity.setFont(new Font("Raleway", Font.BOLD, 20));
        labelCity.setBounds(100, 540, 200, 30);
        add(labelCity);

        textcity = new JTextField("");
        textcity.setFont(new Font("Raleway", Font.BOLD, 14));
        textcity.setBounds(300, 540, 400, 30);
        add(textcity);

        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620, 710, 80, 30);
        next.addActionListener(this);
        add(next);

        ImageIcon sign1 = new ImageIcon(ClassLoader.getSystemResource("icon/signup_back.png"));
        Image sign2 = sign1.getImage().getScaledInstance(850, 800, Image.SCALE_DEFAULT);
        ImageIcon sign3 = new ImageIcon(sign2);
        JLabel image1 = new JLabel(sign3);
        image1.setBounds(0, 0, 850, 800);
        add(image1);

        setLayout(null);
        setSize(850, 800);
        setLocation(360, 40);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        try {
            JTextField[] field = { textName, textFname, textPin, textEmail, textAdd, textcity };
            for (JTextField fields : field) {
                if (fields == null || fields.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Fill all the fields");
                    return;
                }
            }

            if (!(textEmail.getText().matches("^(.+)@(\\S+)$"))) {
                JOptionPane.showMessageDialog(null, "Invalid email inputs");
            } else if (!textName.getText().matches("^[a-zA-Z]+$") || !textFname.getText().matches("^[a-zA-Z]+$")) {
                JOptionPane.showMessageDialog(null,
                        "Invalid name inputs. Name should contain only alphabetic characters.");
            } else if (!textPin.getText().matches("[0-9]+")) {
                JOptionPane.showMessageDialog(null, "Invalid pin inputs");
            } else {
                String name = textName.getText();
                String fname = textFname.getText();
                String gender = r1.isSelected() ? "Male" : "Female";
                String email = textEmail.getText();
                String marital = m1.isSelected() ? "Married" : (m2.isSelected() ? "Unmarried" : "Other");
                String address = textAdd.getText();
                String city = textcity.getText();
                String pincode = textPin.getText();

                FileHandler.saveData(name, fname, pincode, gender, email, marital, address, city);
                new Signup2();
                setVisible(false);
            }
        } catch (Exception E) {
            JOptionPane.showMessageDialog(null, "Unexpected error ");
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Signup obj = new Signup();
    }
}