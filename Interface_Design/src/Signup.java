import javax.swing.*;
import java.awt.*;

public class Signup extends JFrame {

    // Constructor
    public Signup() {
        // Set frame properties
        setTitle("Signup Screen");
        setSize(1000, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame on the screen
        setLayout(new BorderLayout());

        // Create a panel for the form
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Add spacing between components
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Add Name field
        JLabel nameLabel = new JLabel("Name:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        formPanel.add(nameLabel, gbc);

        JTextField nameField = new JTextField(20);
        gbc.gridx = 1;
        formPanel.add(nameField, gbc);

        // Add Father Name field
        JLabel fatherNameLabel = new JLabel("Father Name:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        formPanel.add(fatherNameLabel, gbc);

        JTextField fatherNameField = new JTextField(20);
        gbc.gridx = 1;
        formPanel.add(fatherNameField, gbc);

        // Add Email field
        JLabel emailLabel = new JLabel("Email:");
        gbc.gridx = 0;
        gbc.gridy = 2;
        formPanel.add(emailLabel, gbc);

        JTextField emailField = new JTextField(20);
        gbc.gridx = 1;
        formPanel.add(emailField, gbc);

        // Add Phone Number field
        JLabel phoneLabel = new JLabel("Phone Number:");
        gbc.gridx = 0;
        gbc.gridy = 3;
        formPanel.add(phoneLabel, gbc);

        JTextField phoneField = new JTextField(20);
        gbc.gridx = 1;
        formPanel.add(phoneField, gbc);

        // Add Address field
        JLabel addressLabel = new JLabel("Address:");
        gbc.gridx = 0;
        gbc.gridy = 4;
        formPanel.add(addressLabel, gbc);

        JTextArea addressField = new JTextArea(4, 20);
        addressField.setLineWrap(true);
        addressField.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(addressField);
        gbc.gridx = 1;
        formPanel.add(scrollPane, gbc);

        // Add Gender field
        JLabel genderLabel = new JLabel("Gender:");
        gbc.gridx = 0;
        gbc.gridy = 5;
        formPanel.add(genderLabel, gbc);

        JPanel genderPanel = new JPanel();
        JRadioButton maleButton = new JRadioButton("Male");
        JRadioButton femaleButton = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);
        genderPanel.add(maleButton);
        genderPanel.add(femaleButton);
        gbc.gridx = 1;
        formPanel.add(genderPanel, gbc);

        // Add Submit Button
        JButton submitButton = new JButton("Submit");
        gbc.gridx = 1;
        gbc.gridy = 6;
        gbc.anchor = GridBagConstraints.CENTER;
        formPanel.add(submitButton, gbc);

        // Add form panel to the frame
        add(formPanel, BorderLayout.CENTER);

        // Set frame visibility
        setVisible(true);
    }

    // // Main method for testing
    // public static void main(String[] args) {
    //     new Signup();
    // }
}
