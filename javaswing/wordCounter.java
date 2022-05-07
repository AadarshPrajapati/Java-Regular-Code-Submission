package assignment4.javaswing;

import assignment3.stackUsingSwing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class wordCounter implements ActionListener{
    JTextArea ta;
    JButton bcount;
    JLabel ltitle,lword;
    wordCounter(){
        JFrame jfrm=new JFrame("Word Counter");
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(400,400);
        bcount=new JButton("find word count");
        ta=new JTextArea(10,20);
        lword=new JLabel("");
        ltitle=new JLabel("Enter the string");
        jfrm.add(ltitle);
        jfrm.add(ta);
        jfrm.add(bcount);
        jfrm.add(lword);
        jfrm.setVisible(true);

        bcount.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("find word count")){
            String str=ta.getText();
            String words[]=str.split("\\s");
            lword.setText("total number of words "+words.length);
        }
    }

    public static void main(String args[]){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new wordCounter();
            }
        });
    }


}