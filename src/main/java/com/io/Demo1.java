package com.io;

import javax.swing.*;
import java.io.FileInputStream;

public class Demo1 {
    public static void main(String[] args) {
        byte b[]=new byte[2];
        try{
            FileInputStream fis=new FileInputStream("word.txt");
            ProgressMonitorInputStream in=new ProgressMonitorInputStream(null,"读取文件",fis);
            while(in.read(b)!=-1){
                String s=new String(b);
                System.out.print(s);
                Thread.sleep(100);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
