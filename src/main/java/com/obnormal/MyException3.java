package com.obnormal;

public class MyException3 extends Exception{
    String message;
    public MyException3(String ErrorMessage){
        message=ErrorMessage;
    }
    public String getMessage(){
        return message;
    }
}
