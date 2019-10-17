package com.interfacetest;

public class Demo2 {
    public void draw(){
    }
    public void arr(){
    }

    public static void main(String[] args) {
        Demo2 d=new Demo3();
        d.arr();
        d.draw();
    }
}
class Demo3 extends Demo2{
    public void arr(){
        System.out.println("子类.arr()");
    }
}
