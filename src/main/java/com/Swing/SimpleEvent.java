package com.Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleEvent extends JFrame {
    private JButton jb=new JButton("我是按钮，单击我");
    public SimpleEvent(){
        setLayout(null);
        setSize(300,100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container container=getContentPane();
        container.add(jb);
        jb.setBounds(10,10,100,30);
        jb.addActionListener(new jbAction());
        setVisible(true);
    }
    class jbAction implements ActionListener{
        public void actionPerformed(ActionEvent arg0){
            jb.setText("我被单击了");
        }
    }

    public static void main(String[] args) {
        new SimpleEvent();

    }
}
