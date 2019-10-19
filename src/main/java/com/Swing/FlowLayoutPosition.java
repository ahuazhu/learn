package com.Swing;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutPosition extends JFrame {
    public FlowLayoutPosition(){
        setTitle("本窗体使用流布局管理器");
        Container container=getContentPane();
        setLayout(new FlowLayout(2,10,10));
        for (int i=0;i<10;i++){
            container.add(new Button("botton"+i));
        }
        setSize(300,200);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new FlowLayoutPosition();
    }
}
