package com.io;

import java.io.File;

public class FileTest {
    public static void main(String[] args) {
        File file=new File("word.txt");
        if(file.exists()){
            String name=file.getName();
            long length=file.length();
            boolean hidden=file.isHidden();
            System.out.println("文件名称"+name);
            System.out.println("文件长度"+length);
            System.out.println("是否为隐藏文件"+hidden);
        }else{
                System.out.println("该文件不存在");
        }
    }
}
