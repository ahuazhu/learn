package com.enum1;

public class Demo1 {
    enum Constants2{
        Constants_A,Constants_B
    }
    public static void doit2(Constants2 c){
        switch (c){
            case Constants_A:
                System.out.println("doit2() Constants_A");
                break;
            case Constants_B:
                System.out.println("doit2() Constants_B");
                break;
        }
    }

    public static void main(String[] args) {
        Demo1.doit2(Constants2.Constants_A);
        Demo1.doit2(Constants2.Constants_B);
    }
}
