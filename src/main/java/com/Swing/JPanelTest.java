package com.Swing;

import javax.swing.*;
import java.awt.*;

public class JPanelTest extends JFrame {
    public JPanelTest(){
        Container container=getContentPane();
        container.setLayout(new GridLayout(2,1,10,10));
        JPanel p1=new JPanel(new GridLayout(1,2,10,10));
        JPanel p2=new JPanel(new GridLayout(1,2,10,10));
        JPanel p3=new JPanel(new GridLayout(1,3,10,10));
        JPanel p4=new JPanel(new GridLayout(2,1,10,10));
        p1.add(new JButton("1"));
        p1.add(new JButton("2"));
        p1.add(new JButton("3"));
        p2.add(new JButton("4"));
        p2.add(new JButton("5"));
        p3.add(new JButton("6"));
        p3.add(new JButton("7"));
        p4.add(new JButton("8"));
        p4.add(new JButton("9"));
        container.add(p1);
        container.add(p2);
        container.add(p3);
        container.add(p4);
        setTitle("在这个窗体使用了面板");
        setVisible(true);
        setSize(420,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JPanelTest();
    }
}
