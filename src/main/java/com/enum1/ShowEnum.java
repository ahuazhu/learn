package com.enum1;

public class ShowEnum {
    enum Constants2{
        Constants_A,Constants_B
    }

    public static void main(String[] args) {
        for (int i = 0; i < Constants2.values().length; i++) {
            System.out.println("枚举型成员变量："+Constants2.values()[i]);
        }
    }
}
