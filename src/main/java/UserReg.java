import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserReg extends JFrame {
    private final JTextField email;
    private final JPasswordField passwordField;
    private final JButton btnNewButton;
    String password = "hi";
    String p = "^(?=.{7,})(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@^&!]).*$";
    String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";


    public boolean passwordIsValid(){
        Pattern pattern = Pattern.compile(p);
        Matcher matcher = pattern.matcher(passwordField.getText());
        if (!password.matches(p)){
            throw new IllegalArgumentException(password);
        }
        return matcher.matches();
    }

    public boolean emailIsValid(){
        String emailId = email.getText();
        if (!emailId.matches(regex)){
            throw new IllegalArgumentException(emailId);
        }

        return true;
    }

    public UserReg() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 190, 1014, 597);
        setResizable(false);
        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewUserRegister = new JLabel("New User Register");
        lblNewUserRegister.setFont(new Font("Times New Roman", Font.PLAIN, 42));
        lblNewUserRegister.setBounds(362, 52, 325, 50);
        contentPane.add(lblNewUserRegister);


        JLabel lblEmailAddress = new JLabel("Email\r\n address");
        lblEmailAddress.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblEmailAddress.setBounds(58, 324, 124, 36);
        contentPane.add(lblEmailAddress);


        email = new JTextField();

        email.setFont(new Font("Tahoma", Font.PLAIN, 32));
        email.setBounds(214, 320, 228, 50);
        contentPane.add(email);
        email.setColumns(10);

        JLabel lblPassword = new JLabel("Password");
        lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblPassword.setBounds(542, 152, 99, 24);
        contentPane.add(lblPassword);

        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Tahoma", Font.PLAIN, 32));
        passwordField.setBounds(707, 152, 228, 50);
        contentPane.add(passwordField);

        btnNewButton = new JButton("Register");
        btnNewButton.addActionListener(e -> {
            String p = "^(?=.{7,})(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@^&!]).*$";
            String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
            String emailId = email.getText();
            String password = passwordField.getText();

            if (!password.matches(p)) {
                JOptionPane.showMessageDialog(btnNewButton, "Enter a valid password");
            }

            else if(!emailId.matches(regex)){
                JOptionPane.showMessageDialog(btnNewButton, "Enter a valid email");
            }
            else{
                JOptionPane.showMessageDialog(btnNewButton, "Successfully signed up!");
            }



    });

}}
