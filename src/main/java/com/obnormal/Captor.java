package com.obnormal;

public class Captor {
    static int quotient(int x,int y)throws MyException{
        if (y<0){
            throw new MyException("除数不能为负数");
        }
        return x/y;
    }

    public static void main(String[] args) {
        try {
            int result=quotient(3,-1);
        }catch (MyException e){
            System.out.println(e.getMessage());
        }catch (ArithmeticException e){
            System.out.println("除数不能为0");
        }catch (Exception e){
            System.out.println("程序发生了其他的异常");
        }
    }
}
