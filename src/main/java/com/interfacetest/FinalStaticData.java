package com.interfacetest;

import java.util.Random;

public class FinalStaticData {
    private static Random rand=new Random();
    private final int a1=rand.nextInt(10);
    private static final int a2=rand.nextInt(10);

    public static void main(String[] args) {
        FinalStaticData fdata=new FinalStaticData();
        System.out.println("重新实例化调用a1的值："+fdata.a1);
        System.out.println("重新实例化调用a1的值："+fdata.a2);
        FinalStaticData fdata2=new FinalStaticData();
        System.out.println("重新实例化调用a1的值："+fdata2.a1);
        System.out.println("重新实例化调用a1的值："+fdata2.a2);
    }
}
