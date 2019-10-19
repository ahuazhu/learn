package com.Swing;

import javax.swing.*;
import java.awt.*;

public class AbsolutePosition extends JFrame {
    public AbsolutePosition(){
        setTitle("本窗体使用绝对布局");
        setLayout(null);
        setBounds(0,0,200,150);
        Container container=getContentPane();
        JButton b1=new JButton("按钮1");
        JButton b2=new JButton("按钮2");
        b1.setBounds(10,30,80,30);
        b2.setBounds(60,70,100,20);
        container.add(b1);
        container.add(b2);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new AbsolutePosition();
    }
}
