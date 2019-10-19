package com.Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyJDialog extends JDialog {
    public MyJDialog(JFrame frame){
        super(frame,"对话框标题 ",true);
        Container container=getContentPane();
        container.add(new JLabel("这是一个对话框"));
        setVisible(true);
        setBounds(800,600,300,200);
    }

    public static void main(String[] args) {
        final JFrame jf=new JFrame("父窗体");
        jf.setBounds(800,600,300,300);
        Container container=jf.getContentPane();
        JButton btn=new JButton("弹出对话框");
        container.setLayout(new FlowLayout());
        container.add(btn);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MyJDialog jd=new MyJDialog(jf);
                jd.setVisible(true);
            }
        });
    }
}
