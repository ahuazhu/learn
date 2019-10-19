package com.Swing;

import javax.swing.*;
import java.awt.*;

public class DrawIcon implements Icon {
    private int width;
    private int height;
    public int getIconHeight(){
        return this.height;
    }
    public int getIconWidth(){
        return this.width;
    }
    public DrawIcon(int width,int height){
        this.width=width;
        this.height=height;
    }
    public void paintIcon(Component arg0,Graphics arg1,int x,int y){
        arg1.fillOval(x,y,width,height);
    }
    public static void main(String[] args) {
        DrawIcon icon = new DrawIcon(15, 15);
        JLabel j = new JLabel("测试", icon, SwingConstants.CENTER);
        JFrame jf = new JFrame();
        Container c = jf.getContentPane();
        c.add(j);
        jf.setBounds(800, 600, 300, 300);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
