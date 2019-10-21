package com.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo3 {
    static final int linelength=81;
    public static void main(String[] args) {
        FileOutputStream fos;
        byte[] phone=new byte[linelength];
        byte[] name=new byte[linelength];
        try{
            fos=new FileOutputStream("word.txt");
            while(true){
                System.err.println("请输入一个名字：");
                if("done".equalsIgnoreCase(new String(name,0,0,4))){
                    System.out.println("录入完毕");
                    break;
                }
                System.err.println("请输入电话号码：");
                readLine(phone);
                for (int i = 0;phone[i]!=0; i++) {
                    fos.write(phone[i]);
                }
                fos.write(',');
                for (int j = 0;name[j]!=0; j++) {
                    fos.write(name[j]);
                }
                fos.write('\n');
                System.out.println("文件已经写入");
            }
            fos.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void readLine(byte[] name)throws IOException {
        int b=0,i=0;
        while ((i<(linelength-1))&&(b=System.in.read())!='\n') {
            name[i++]=(byte)b;
            }
        name[i]=(byte)0;
        }
    }


