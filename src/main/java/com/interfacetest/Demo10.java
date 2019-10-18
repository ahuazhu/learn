package com.interfacetest;

public class Demo10 {
    public static void main(String[] args) {
        Demo10.Demo11 d=new Demo11();
        d.f();
    }
    static class Demo11{
        void f(){
            System.out.println("f()");
        }
    }
}
