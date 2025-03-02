import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    final JFrame frame;
    final JPanel panel;
    final JLabel userLabel;
    final JLabel passLabel;
    final JButton button;
    final JTextField userText;
    final JPasswordField passText;
    final JLabel success;


    public GUI() {
        frame = new JFrame();
        panel = new JPanel();

        //set frame
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        // set panel
        panel.setLayout(null);

        userLabel = new JLabel("User:");
        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(100, 20, 165,25);
        panel.add(userText);

        passLabel = new JLabel("Password:");
        passLabel.setBounds(10,50,80,25);
        panel.add(passLabel);

        passText = new JPasswordField(20);
        passText.setBounds(100, 50, 165,25);
        panel.add(passText);

        button = new JButton("Login");
        button.setBounds(10,80,80,25);
        button.addActionListener(this);
        panel.add(button);

        success = new JLabel("");
        success.setBounds(10,110,300,25);
        panel.add(success);

        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = passText.getText();

        if(user.equals("Liyana") && password.equals("123aaa")){
            success.setText("Login successful!");
        }
        else {
            success.setText("no");
            System.out.println(user + ", " + password);
        }
    }
}