package com.Swing;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutPosition extends JFrame {
    String border[]={BorderLayout.CENTER,BorderLayout.NORTH,BorderLayout.SOUTH, BorderLayout.WEST,BorderLayout.EAST};
    String buttonName[]={"center button","north button","south button", "west button","east button"};
    public BorderLayoutPosition(){
        setTitle("这个窗体使用边界布局管理器");
        Container container=getContentPane();
        setLayout(new BorderLayout());
        for (int i = 0; i < border.length; i++) {
            container.add(border[i],new JButton(buttonName[i]));
        }
        setSize(350,200);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new BorderLayoutPosition();
    }
}
