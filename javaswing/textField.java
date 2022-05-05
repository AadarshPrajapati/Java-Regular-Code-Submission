package assignment4.javaswing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class textField implements ActionListener{
    JTextField jtf;
    JButton jbtncount;
    JLabel jlabcount, jlabContents;

    textField(){
        JFrame jfrm = new JFrame("Text Field Example");

        jfrm.setLayout(new FlowLayout());

        jfrm.setSize(300,300);

        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jtf = new JTextField(20);

        jtf.setActionCommand("countTF");

        jbtncount = new JButton("Count");

        jtf.addActionListener(this);
        jbtncount.addActionListener(this);

        jlabcount = new JLabel("Enter Text ");
        jlabContents = new JLabel("");

        jfrm.add(jlabcount);
        jfrm.add(jtf);
        jfrm.add(jbtncount);
        jfrm.add(jlabContents);

        jfrm.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if (ae.getActionCommand().equals("Count")){
            String strcount = jtf.getText();
            int count=0;

            count=strcount.length();

            jlabContents.setText("the total length of text you entered "+count);
        }else{
            jlabcount.setText("the text you entered is "+jtf.getText());
        }
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new textField();
            }
        });
    }
}
