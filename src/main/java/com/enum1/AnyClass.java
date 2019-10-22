package com.enum1;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class AnyClass {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<Integer>();
        a.add(1);
        for (int i = 0; i < a.size(); i++) {
            System.out.println("获取ArrayList容器的值："+a.get(i));
        }
        Map<Integer,String> m=new HashMap<Integer, String>();
        for (int i = 0; i < 5; i++) {
            m.put(i,"成员"+i);
        }
        for (int i = 0; i < m.size(); i++) {
            System.out.println("获取Map容器的值"+m.get(i));
        }
        Vector<String> v=new Vector<String>();
        for (int i = 0; i < 5; i++) {
            v.addElement("成员"+i);
        }
        for (int i = 0; i < v.size(); i++) {
            System.out.println("获取Vector容器的值"+v.get(i));
        }
    }
}
