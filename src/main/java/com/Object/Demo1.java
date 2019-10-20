package com.Object;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();
        for (int i = 1; i <=100; i++) {
            list.add(i);
        }
        System.out.println("移除前的集合元素为：");
        for (int j = 0; j < list.size(); j++) {
            System.out.print(+list.get(j));
        }
        System.out.println();
        list.remove(10);
        System.out.println("移除后的集合元素为：");
        for (int k = 0; k < list.size(); k++) {
            System.out.print(+list.get(k));
        }
    }
}
