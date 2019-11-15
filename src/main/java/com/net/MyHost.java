package com.net;

import java.net.InetAddress;

public class MyHost {
    public static void main(String[] args) {
        InetAddress ip=null;
        try {
            ip=InetAddress.getByName("localhost");
            System.out.println("主机名："+ip.getHostName());
            System.out.println("主机IP地址："+ip.getHostAddress());
            System.out.println("本机IP地址："+ip.getLocalHost().getHostAddress());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
