package com.obnormal;

public class Number {
    static int count(int m,int n)throws Exception{
        return m*n;
    }

    public static void main(String[] args) {
        try{
            int result=count(999,314159);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
