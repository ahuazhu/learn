package com.Swing;

import javax.swing.*;
import java.awt.*;

public class JScrollPaneTest extends JFrame {
    public JScrollPaneTest(){
        Container container=getContentPane();
        JTextArea ta=new JTextArea(20,50);
        JScrollPane sp=new JScrollPane(ta);
        container.add(sp);
        setTitle("带滚动条的文字编辑器");
        setSize(200,200);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JScrollPaneTest();
    }
}
