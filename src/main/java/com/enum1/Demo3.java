package com.enum1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Demo3<T> {
    public void doSomething(Demo3<? extends List<Object>> t){
        System.out.println(t.getClass().getName());
    }

    public static void main(String[] args) {
        Demo3<? extends List<Object>> t=new Demo3<ArrayList<Object>>();
        t.doSomething(new Demo3<ArrayList<Object>>());
        t.doSomething(new Demo3<LinkedList<Object>>());
        Demo3<? super List<Object>> t2=null;
        t2=new Demo3<List<Object>>();
    }
}
