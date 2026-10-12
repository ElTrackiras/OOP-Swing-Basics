import javax.swing.*;

public class LoginForm extends JFrame {
    JLabel loginTxt = new JLabel("Login Your Username");
    JTextField usernameField = new JTextField();
    JButton submitBtn = new JButton("Submit");

    public void displayLogin(){
        setTitle("My System");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(null);

        loginTxt.setBounds(100, 20, 200, 25);
        add(loginTxt);

        usernameField.setBounds(100, 50, 200, 50);
        add(usernameField);

        submitBtn.setBounds(100, 130, 150, 40);
        add(submitBtn);

        submitBtn.addActionListener(e -> login_process());


        setVisible(true);
    }

    public void login_process(){
        System.out.println("Login Attempt!");
        String username_value = usernameField.getText();
        System.out.println(username_value);
    }


}
