package com.obnormal;

public class Student {
    static int speak(int m)throws MyException1{
        if (m>1000){
            throw new MyException1("参数太大了");
        }
        return m;
    }

    public static void main(String[] args) {
        try {
            int result=speak(1001);
            System.out.println(result);
        }catch (MyException1 e){
            e.printStackTrace();
        }
    }
}
