package com.Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTextFieldTest extends JFrame {
    public JTextFieldTest(){
        Container container=getContentPane();
        container.setLayout(new FlowLayout());
        setVisible(true);
        setSize(300,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        final JTextField jt=new JTextField("aaa",20);
        final JButton jb=new JButton("清除");
        container.add(jb);
        container.add(jt);
        jt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jt.setText("触发事件");
            }
        });
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jt.setText("");
                jt.requestFocus();
            }
        });
    }

    public static void main(String[] args) {
        new JTextFieldTest();
    }
}
