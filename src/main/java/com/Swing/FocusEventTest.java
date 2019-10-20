package com.Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class FocusEventTest extends JFrame {
    public FocusEventTest(){
        Container container=getContentPane();
        setSize(300,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JTextField jt=new JTextField("请单击其他文本框",10);
        JTextField jt2=new JTextField("请单击我",10);
        container.add(jt);
        container.add(jt2);
        jt.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                JOptionPane.showConfirmDialog(null,"文本框失去焦点");
            }

            @Override
            public void focusLost(FocusEvent e) {
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        new FocusEventTest();
    }
}
