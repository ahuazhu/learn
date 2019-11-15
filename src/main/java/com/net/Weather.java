package com.net;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class Weather extends Thread {
    String weather="节目预报：八点有大型晚会，请收听";
    int port=9898;
    InetAddress iaddress=null;
    MulticastSocket socket=null;
    Weather(){
        try{
            iaddress=InetAddress.getByName("224.255.10.0");
            socket=new MulticastSocket(port);
            socket.setTimeToLive(1);
            socket.joinGroup(iaddress);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void run(){
        while (true){
            DatagramPacket packet=null;
            byte[] data=weather.getBytes();
            packet=new DatagramPacket(data,data.length,iaddress,port);
            System.out.println(new String(data));
            try {
                socket.send(packet);
                sleep(3000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Weather w=new Weather();
        w.start();
    }
}
