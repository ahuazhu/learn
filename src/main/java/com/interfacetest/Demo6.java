package com.interfacetest;

interface Demo7{
    public void draw();
}
public class Demo6 {
}
class Demo8{
    public Demo7 doit(final String x){
        return new Demo7() {
            public void draw() {
            }
            private int i=0;
            public int getValue(){
                System.out.println(x);
                return i;
            }
            public void f(){
                System.out.println("f()");
            }
        };
    }
}
