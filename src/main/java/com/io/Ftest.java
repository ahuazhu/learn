package com.io;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Ftest extends JFrame {
    private static final long serialVersionUID=1L;
    private JPanel jp=null;
    private JTextArea jt=null;
    private JPanel jp2=null;
    private JButton jb=null;
    private JButton jb2=null;

    private JTextArea getJt(){
        if(jt==null){
            jt=new JTextArea();
        }
        return jt;
    }

    private JPanel getJp2(){
        if(jp2==null){
            FlowLayout flowLayout=new FlowLayout();
            flowLayout.setVgap(1);
            jp2=new JPanel();
            jp2.setLayout(new FlowLayout());
            jp2.add(getJb(),null);
            jp2.add(getJb2(),null);
        }
        return jp2;
    }
    private JButton getJb(){
        if(jb==null){
            jb=new JButton();
            jb.setText("写个文件");
            jb.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    File file=new File("word.txt");
                    try{
                        FileWriter out=new FileWriter(file);
                        String s=jt.getText();
                        out.write(s);
                        out.close();
                    }catch (Exception e1){
                        e1.printStackTrace();
                    }
                }
            });
        }
        return jb;
    }
    private JButton getJb2(){
        if(jb2==null){
            jb2=new JButton();
            jb2.setText("提取文件");
            jb2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    File file=new File("word.txt");
                    try{
                        FileReader in=new FileReader(file);
                        char byt[]=new char[1024];
                        int len=in.read(byt);
                        jt.setText(new String(byt,0,len));
                        in.close();
                    }catch (Exception e1){
                        e1.printStackTrace();
                    }
                }
            });
        }
        return jb2;
    }
    public Ftest(){
        super();
        initialize();
    }
    private void initialize(){
        this.setSize(300,200);
        this.setContentPane(getJp());
        this.setTitle("JFrame");
    }
    private JPanel getJp(){
        if(jp==null){
            jp=new JPanel();
            jp.setLayout(new BorderLayout());
            jp.add(getJt(),BorderLayout.CENTER);
            jp.add(getJp2(),BorderLayout.SOUTH);
        }
        return jp;
    }

    public static void main(String[] args) {
        Ftest thisClass=new Ftest();
        thisClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        thisClass.setVisible(true);
    }
}
