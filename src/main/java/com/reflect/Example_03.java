package com.reflect;

public class Example_03 {
    static void staticMethod(){
        System.out.println("执行 staticMethod()方法");
    }
    public int publicMethod(int i){
        System.out.println("执行 publicMethod()方法");
        return i*100;
    }
    protected int protectedMethod(String s,int i)throws NumberFormatException{
        System.out.println("执行 protectedMethod()方法");
        return Integer.valueOf(s)+i;
    }
    private String privateMethod(String...strings){
        System.out.println("执行 privateMethod()方法");
        StringBuffer stringBuffer=new StringBuffer();
        for (int i = 0;i<strings.length; i++) {
            stringBuffer.append(strings[i]);
        }
        return stringBuffer.toString();
    }
}
