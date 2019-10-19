package com.Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBoxTest extends JFrame {
    private JPanel p1=new JPanel();
    private JPanel p2=new JPanel();
    private JTextArea jt=new JTextArea(3,10);
    private  JCheckBox j1=new JCheckBox("1");
    private  JCheckBox j2=new JCheckBox("2");
    private  JCheckBox j3=new JCheckBox("3");
    public CheckBoxTest(){
        Container container=getContentPane();
        container.setLayout(new BorderLayout());
        container.add(p1,BorderLayout.NORTH);
        final JScrollPane js=new JScrollPane(jt);
        p1.add(js);
        container.add(p2,BorderLayout.SOUTH);
        p2.add(j1);
        j1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jt.append("复选框1被选中\n");
            }
        });
        p2.add(j2);
        j1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jt.append("复选框2被选中\n");
            }
        });
        p2.add(j3);
        j1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jt.append("复选框3被选中\n");
            }
        });
        setTitle("复选框");
        setSize(200,200);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new CheckBoxTest();
    }
}
