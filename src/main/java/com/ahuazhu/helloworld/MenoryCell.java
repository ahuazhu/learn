package com.ahuazhu.helloworld;

public class MenoryCell {
    private Object storedValue;
    public Object read(){
        return storedValue;
    }
    public void write(Object x){
        storedValue=x;
    }
}
