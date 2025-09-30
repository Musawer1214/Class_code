import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class LoginPage {
    private JFrame frame;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JLabel feedbackLabel;

    public LoginPage() {
        buildUI();
    }

    private void buildUI() {
        frame = new JFrame("Login Portal");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 320);
        frame.setLocationRelativeTo(null);

        JPanel content = new JPanel(new BorderLayout(0, 20));
        content.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel header = new JLabel("Welcome", JLabel.CENTER);
        header.setFont(new Font("SansSerif", Font.BOLD, 24));
        header.setForeground(new Color(33, 37, 41));
        content.add(header, BorderLayout.NORTH);

        JPanel form = new JPanel(new GridBagLayout());
        form.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(206, 212, 218)),
                BorderFactory.createEmptyBorder(20, 20, 20, 20)));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 8, 8);
        gbc.anchor = GridBagConstraints.WEST;

        JLabel usernameLabel = new JLabel("Username:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        form.add(usernameLabel, gbc);

        usernameField = new JTextField(18);
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        form.add(usernameField, gbc);

        JLabel passwordLabel = new JLabel("Password:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.NONE;
        form.add(passwordLabel, gbc);

        passwordField = new JPasswordField(18);
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        form.add(passwordField, gbc);

        JCheckBox rememberBox = new JCheckBox("Remember me");
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.NONE;
        form.add(rememberBox, gbc);

        JButton loginButton = new JButton("Log In");
        loginButton.addActionListener(e -> attemptLogin());
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.EAST;
        form.add(loginButton, gbc);

        content.add(form, BorderLayout.CENTER);

        feedbackLabel = new JLabel(" ", JLabel.CENTER);
        feedbackLabel.setFont(new Font("SansSerif", Font.PLAIN, 12));
        feedbackLabel.setForeground(new Color(220, 53, 69));
        content.add(feedbackLabel, BorderLayout.SOUTH);

        frame.setContentPane(content);
    }

    private void attemptLogin() {
        String username = usernameField.getText().trim();
        String password = new String(passwordField.getPassword());

        if (username.isEmpty() || password.isEmpty()) {
            feedbackLabel.setForeground(new Color(220, 53, 69));
            feedbackLabel.setText("Please enter both username and password.");
            return;
        }

        if ("admin".equalsIgnoreCase(username) && "password".equals(password)) {
            feedbackLabel.setForeground(new Color(25, 135, 84));
            feedbackLabel.setText("Login successful. Welcome back!");
            JOptionPane.showMessageDialog(frame, "Logged in as " + username + "!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            feedbackLabel.setForeground(new Color(220, 53, 69));
            feedbackLabel.setText("Invalid credentials. Try again.");
        }
    }

    public void show() {
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LoginPage().show());
    }
}
