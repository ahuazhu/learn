package com.Swing;

import javax.swing.*;
import java.awt.*;

public class Demo1 extends JFrame {
    private JComboBox comboBox;
    public Demo1(){
        Container container=getContentPane();
        setBounds(900,600,300,200);
        comboBox=new JComboBox();
        comboBox.addItem("红");
        comboBox.addItem("黄");
        comboBox.addItem("蓝");
        comboBox.addItem("绿");
        container.add(comboBox,BorderLayout.NORTH);
        final JPanel p1=new JPanel();
        container.add(p1,BorderLayout.CENTER);
        final JCheckBox jc1=new JCheckBox("男");
        final JCheckBox jc2=new JCheckBox("女");
        p1.add(jc1);
        p1.add(jc2);
        final JPanel p2=new JPanel();
        container.add(p2,BorderLayout.SOUTH);
        final JButton jb1=new JButton("确定");
        final JButton jb2=new JButton("取消");
        p2.add(jb1);
        p2.add(jb2);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Demo1();
    }
}
