package com.Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demo2 extends JFrame {
    private String[] contents={"列表1","列表2","列表3","列表4","列表5"};
    private JComboBox jc=new JComboBox();
    private JButton jb=new JButton("提交");
    int count=0;
    public Demo2(){
        Container container=getContentPane();
        setSize(300,200);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        container.add(jb);
        container.add(jc);
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (count<contents.length){
                    jc.addItem(contents[count++]);
                }
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        new Demo2();
    }
}
