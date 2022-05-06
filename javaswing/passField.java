package assignment4.javaswing;
import javax.swing.*;
import java.awt.*;

public class passField {
        public static void main(String[] args) {
            JFrame jfrm=new JFrame("Password Field Demo");
            JPasswordField value = new JPasswordField();
            JLabel jlab1=new JLabel("Password:");
            jlab1.setBounds(20,100, 80,30);
            value.setBounds(100,100,100,30);
            jfrm.add(value);  jfrm.add(jlab1);
            jfrm.setSize(300,300);
            jfrm.setLayout(null);
            jfrm.setVisible(true);
        }
}
