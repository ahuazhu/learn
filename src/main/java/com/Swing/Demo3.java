package com.Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demo3 extends JFrame {
    public Demo3(){
        setTitle("登录窗体");
        Container container=getContentPane();
        setBounds(800,600,300,150);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);
        JLabel j1=new JLabel("用户名：");
        j1.setBounds(10,10,200,18);
        final JTextField jt=new JTextField();
        jt.setBounds(80,10,150,18);
        JLabel j2=new JLabel("密码：");
        j2.setBounds(10,50,200,18);
        final JPasswordField jp=new JPasswordField();
        jp.setBounds(80,50,150,18);
        container.add(j1);
        container.add(j2);
        container.add(jt);
        container.add(jp);
        JButton jb=new JButton("确定");
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(jt.getText().trim().length()==0||new String(jp.getPassword()).trim().length()==0){
                    JOptionPane.showConfirmDialog(null,"用户名密码不许为空");
                    return;
                }
                if (jt.getText().trim().equals("mr")&&new String(jp.getPassword()).trim().equals("mrsoft")){
                    JOptionPane.showConfirmDialog(null,"denglchengg");
                }else{
                    JOptionPane.showConfirmDialog(null,"用户名或密码错误");
                }
            }
        });
        jb.setBounds(80,80,60,18);
        container.add(jb);
        final JButton jb2=new JButton("重置");
        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jt.setText("");
                jp.setText("");
            }
        });
        jb2.setBounds(150,80,60,18);
        container.add(jb2);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Demo3();
    }
}
