package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class practice extends JFrame implements ActionListener {
    JLabel titleLabel, nameLabel, emailLabel, passwordLabel, confirmPasswordLabel, countryLabel, stateLabel, phoneLabel;
    JTextField nameTextField, emailTextField, countryTextField, stateTextField, phoneTextField;
    JPasswordField passwordField, confirmPasswordField;
    JButton submitButton, clearButton;

    public practice() {
        setVisible(true);
        setSize(700, 700);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Registration Form in Java");

        titleLabel = new JLabel("Registration Form in Windows Form:");
        titleLabel.setForeground(Color.blue);
        titleLabel.setFont(new Font("Serif", Font.BOLD, 20));

        nameLabel = new JLabel("Name:");
        emailLabel = new JLabel("Email-ID:");
        passwordLabel = new JLabel("Create Password:");
        confirmPasswordLabel = new JLabel("Confirm Password:");
        countryLabel = new JLabel("Country:");
        stateLabel = new JLabel("State:");
        phoneLabel = new JLabel("Phone No:");

        nameTextField = new JTextField();
        emailTextField = new JTextField();
        passwordField = new JPasswordField();
        confirmPasswordField = new JPasswordField();
        countryTextField = new JTextField();
        stateTextField = new JTextField();
        phoneTextField = new JTextField();

        submitButton = new JButton("Submit");
        clearButton = new JButton("Clear");

        submitButton.addActionListener(this);
        clearButton.addActionListener(this);

        titleLabel.setBounds(100, 30, 400, 30);
        nameLabel.setBounds(80, 70, 200, 30);
        emailLabel.setBounds(80, 110, 200, 30);
        passwordLabel.setBounds(80, 150, 200, 30);
        confirmPasswordLabel.setBounds(80, 190, 200, 30);
        countryLabel.setBounds(80, 230, 200, 30);
        stateLabel.setBounds(80, 270, 200, 30);
        phoneLabel.setBounds(80, 310, 200, 30);

        nameTextField.setBounds(300, 70, 200, 30);
        emailTextField.setBounds(300, 110, 200, 30);
        passwordField.setBounds(300, 150, 200, 30);
        confirmPasswordField.setBounds(300, 190, 200, 30);
        countryTextField.setBounds(300, 230, 200, 30);
        stateTextField.setBounds(300, 270, 200, 30);
        phoneTextField.setBounds(300, 310, 200, 30);

        submitButton.setBounds(50, 350, 100, 30);
        clearButton.setBounds(170, 350, 100, 30);

        add(titleLabel);
        add(nameLabel);
        add(nameTextField);
        add(emailLabel);
        add(emailTextField);
        add(passwordLabel);
        add(passwordField);
        add(confirmPasswordLabel);
        add(confirmPasswordField);
        add(countryLabel);
        add(countryTextField);
        add(stateLabel);
        add(stateTextField);
        add(phoneLabel);
        add(phoneTextField);
        add(submitButton);
        add(clearButton);
    }

    public static void main(String args[]) {
        new practice();
    }
}
