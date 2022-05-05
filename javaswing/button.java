package assignment4.javaswing;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class button implements ActionListener{
    JLabel jlab;

    button(){
        JFrame jfrm = new JFrame("A Button Clicking Example");

        jfrm.setLayout(new FlowLayout());

        jfrm.setSize(300,300);

        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton jbtnleft = new JButton("left");
        JButton jbtnright = new JButton("right");

        jbtnleft.addActionListener(this);
        jbtnright.addActionListener(this);

        jfrm.add(jbtnleft);
        jfrm.add(jbtnright);

        jlab = new JLabel("Press a Button");

        jfrm.add(jlab);

        jfrm.setVisible(true);

    }

    public void actionPerformed(ActionEvent ae){
        if (ae.getActionCommand().equals("left")){
            jlab.setText("You Pressed left");
        }else{
            jlab.setText("You Pressed right");
        }
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new button();
            }
        });
    }
}
