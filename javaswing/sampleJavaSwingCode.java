package assignment4.javaswing;

import javax.swing.*;
import java.awt.*;

public class sampleJavaSwingCode{

    sampleJavaSwingCode(){
        JFrame jframe = new JFrame("Title Here");

        jframe.setSize(275,100);

        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel jlab = new JLabel("label will come here 1");
        JLabel jlab2=new JLabel("label 2");
        jframe.setLayout(new FlowLayout());
        jframe.add(jlab);
        jframe.add(jlab2);

        jframe.setVisible(true);
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new sampleJavaSwingCode();
            }
        });
    }
}
