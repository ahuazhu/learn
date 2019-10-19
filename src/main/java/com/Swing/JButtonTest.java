package com.Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class JButtonTest extends JFrame {
    public JButtonTest(){
        //URL url=MyImageIcon.class.getResource("/imageButtoo.jpg");
        //Icon icon=new ImageIcon(url);
        setLayout(new GridLayout(3,2,5,5));
        Container container=getContentPane();
        for (int i=0;i<5;i++){
            JButton J=new JButton("button");
            container.add(J);
            if (i%2==0){
                J.setEnabled(false);
            }
        }
        JButton jb=new JButton();
        jb.setMaximumSize(new Dimension(90,30));
        //jb.setIcon(icon);
        jb.setHideActionText(true);
        jb.setToolTipText("图片按钮");
        jb.setBorderPainted(false);
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(null,"弹出对话框");
            }
        });
        container.add(jb);
        setSize(300,300);
        setTitle("创建带文字与图片得按钮");
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JButtonTest();
    }
}
