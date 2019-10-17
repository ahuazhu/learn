package com.interfacetest;

public abstract class Demo4 {
    abstract void testAbstract();
    Demo4(){
        System.out.println("before testAbstract()");
        testAbstract();
        System.out.println("after testAbstract()");
    }

    public static void main(String[] args) {
        new Demo5();
    }
}
class Demo5 extends Demo4{
    private int i=1;
    void testAbstract(){
        System.out.println("testAbstract()"+i);
    }
    Demo5(){
        System.out.println(i);
    }
}
