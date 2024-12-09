import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {

    // Constructor
    public Login() {
        // Set frame properties
        setTitle("Login Screen");
        setSize(1000, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame on the screen
        setLayout(new BorderLayout());

        // Add a success message in the center
        JLabel successMessage = new JLabel("You are successfully logged in to the Application", SwingConstants.CENTER);
        successMessage.setFont(new Font("Arial", Font.BOLD, 20));
        add(successMessage, BorderLayout.CENTER);

        // Add a menu bar with dropdown options
        JMenuBar menuBar = new JMenuBar();

        // Create "File" menu
        JMenu fileMenu = new JMenu("File");
        JMenuItem newOption = new JMenuItem("New");
        JMenuItem openOption = new JMenuItem("Open");
        JMenuItem exitOption = new JMenuItem("Exit");
        fileMenu.add(newOption);
        fileMenu.add(openOption);
        fileMenu.addSeparator(); // Add a separator line
        fileMenu.add(exitOption);

        // Create "Edit" menu
        JMenu editMenu = new JMenu("Edit");
        JMenuItem cutOption = new JMenuItem("Cut");
        JMenuItem copyOption = new JMenuItem("Copy");
        JMenuItem pasteOption = new JMenuItem("Paste");
        editMenu.add(cutOption);
        editMenu.add(copyOption);
        editMenu.add(pasteOption);

        // Create "Help" menu
        JMenu helpMenu = new JMenu("Help");
        JMenuItem aboutOption = new JMenuItem("About");
        helpMenu.add(aboutOption);

        // Add menus to the menu bar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        // Add the menu bar to the frame
        setJMenuBar(menuBar);

        // Set frame visibility
        setVisible(true);
    }
}
