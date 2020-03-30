import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



public class loginGUI {
   
   static JLabel userLabel;
   public static JTextField userText;
   public static JLabel passwordlabel;
   public static JPasswordField passwordText;
   public static JButton button;
   public static JLabel label;
   public static JPanel panel;
   public static JFrame frame;
   public static JLabel success;
     public static void main(String[] args){
        
       
        panel = new JPanel();
        frame = new JFrame();
        
        frame.setSize(400,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.add(panel);

        panel.setLayout(null);

        userLabel = new JLabel("Username");
        userLabel.setBounds(40, 20, 80, 25);
        panel.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(150, 20, 165, 25);
        panel.add(userText);

        passwordlabel = new JLabel("Password");
        passwordlabel.setBounds(40, 50, 80, 25);
        panel.add(passwordlabel);

        passwordText = new JPasswordField(20);
        passwordText.setBounds(150, 50, 165, 25);
        panel.add(passwordText);

        button = new JButton("login");
        button.setBounds(40, 100, 80, 25);
        panel.add(button);

        button = new JButton("reset");
        button.setBounds(140, 100, 80, 25);
        panel.add(button);

        button = new JButton("cancel");
        button.setBounds(230, 100, 80, 25);
        panel.add(button);

        frame.setVisible(true);
        //no action has been performed after the buttons are clicked
     }
}