package com.obnormal;

public class Computer {
    public static int divisor(int x,int y)throws MyException3{
        if(x<=0||y<=0){
            throw new MyException3("传递的参数不是正整数");
        }
        if (x<y){
         int temp=0;
         temp=x;
         x=y;
         y=temp;
        }
        int r=x%y;
        while(r!=0){
            x=y;
            y=r;
            r=x%y;
        }
        return x;
    }

    public static void main(String[] args) {
        try{
            int result=divisor(6,0);
            System.out.println(result);
        }catch (MyException3 e){
            e.printStackTrace();
        }
    }
}
