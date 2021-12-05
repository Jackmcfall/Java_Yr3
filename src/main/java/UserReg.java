import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * UserReg class extends from JFrame
 * Allows instances of email, password and buttons to be created in order to create GUI
 */

public class UserReg extends JFrame {
    /**
     * JTextField acts as normal text for GUI
     * JPasswordField allows password to be hidden when typed
     * JButton acts as the submit/register button
     * String p for password, must contain minimum 7 characters, uppercase and lowercase letter, a digit and one of listed special characters
     * String regex for email, must contain a letter or number, followed by @, followed by letter or number.
     */
    private final JTextField email;
    private final JPasswordField passwordField;
    private final JButton btnNewButton;
    String p = "^(?=.{7,})(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@^&!]).*$";
    String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";

    /**
     * main method to create GUI
     * @param args
     * EventQueue.invokeLater() allows method to be run after all pending events are processed
     * try allows definition of code to be tested for errors
     * catch allows this block of code to be executed if error occurs in try block
     */

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                UserReg frame = new UserReg();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    /**
     * passwordIsValid method
     * @return returns password as text
     * if statement checks if password does not match p defined
     * otherwise it throws IllegalArgumentException
     */

    public boolean passwordIsValid(){
        String password = passwordField.getText();
        Pattern pattern = Pattern.compile(p);
        Matcher matcher = pattern.matcher(passwordField.getText());
        if (!password.matches(p)){
            throw new IllegalArgumentException(password);
        }
        return matcher.matches();
    }

    /**
     * emailIsValid method
     * @return
     * if statement checks if email does not match regex defined
     * otherwise it throws IllegalArgumentException
     */

    public boolean emailIsValid(){
        String emailId = email.getText();
        if (!emailId.matches(regex)){
            throw new IllegalArgumentException(emailId);
        }

        return true;
    }

    /**
     * UserReg method ie the constructor
     * allows GUI to be created
     */

    public UserReg() {
        /**
         * sets boundaries and nice GUI using JComponent and its containers such as JPanel
         */
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 190, 1014, 597);
        setResizable(false);
        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        /**
         * JLabel acts as a display area for Strings ie "New User Register"
         * Chose boundaries/dimensions and font using setFont and setBounds from class Container
         */

        JLabel lblNewUserRegister = new JLabel("New User Register");
        lblNewUserRegister.setFont(new Font("Times New Roman", Font.PLAIN, 42));
        lblNewUserRegister.setBounds(362, 52, 325, 50);
        contentPane.add(lblNewUserRegister);

        /**
         * JLabel acts as a display area for Strings ie "Email address" where user types in their email address
         * Chose boundaries/dimensions and font using setFont and setBounds from class Container
         */


        JLabel lblEmailAddress = new JLabel("Email\r\n address");
        lblEmailAddress.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblEmailAddress.setBounds(58, 324, 124, 36);
        contentPane.add(lblEmailAddress);

        /**
         * new instance of email created
         * Chose boundaries/dimensions, font and columns using setFont and setBounds from class Container
         */


        email = new JTextField();
        email.setFont(new Font("Tahoma", Font.PLAIN, 32));
        email.setBounds(214, 320, 228, 50);
        contentPane.add(email);
        email.setColumns(10);

        /**
         * JLabel acts as a display area for Strings ie "Password" where the user types in their password
         * Chose boundaries/dimensions and font using setFont and setBounds from class Container
         */

        JLabel lblPassword = new JLabel("Password");
        lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblPassword.setBounds(542, 152, 99, 24);
        contentPane.add(lblPassword);

        /**
         * new instance of password created
         * Chose boundaries/dimensions and font using setFont and setBounds from class Container
         */

        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Tahoma", Font.PLAIN, 32));
        passwordField.setBounds(707, 152, 228, 50);
        contentPane.add(passwordField);

        /**
         * creates button "Register" where user clicks once they filled in details
         */

        btnNewButton = new JButton("Register");
        btnNewButton.addActionListener(e -> {
            /**
             * addActionListener allows button to be pressed
             */
            String p = "^(?=.{7,})(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@^&!]).*$";
            String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
            String emailId = email.getText();
            String password = passwordField.getText();

            /**
             * if statement checks if password does not match p defined
             * otherwise shows message to user to input correct password
             */

            if (!password.matches(p)) {
                JOptionPane.showMessageDialog(btnNewButton, "Enter a valid password");
            }

            /**
             * else if statement checks if email does not match regex defined
             * otherwise shows message to user to input correct email
             */

            else if(!emailId.matches(regex)){
                JOptionPane.showMessageDialog(btnNewButton, "Enter a valid email");
            }

            /**
             * tells user they have signed up successfully once they have entered the correct details
             */

            else{
                JOptionPane.showMessageDialog(btnNewButton, "Successfully signed up!");
            }
        });

        /**
         * setting bounds and font for button to be pressed
         */

        btnNewButton.setFont(new Font("Ariel", Font.PLAIN, 22));
        btnNewButton.setBounds(399, 447, 259, 74);
        contentPane.add(btnNewButton);




}}






